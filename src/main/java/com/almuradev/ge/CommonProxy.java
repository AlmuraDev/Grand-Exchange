/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge;

import com.almuradev.ge.configuration.MappedConfigurationAdapter;
import com.almuradev.ge.configuration.ModConfiguration;
import com.almuradev.ge.configuration.category.ConnectionCategory;
import com.almuradev.ge.configuration.serializer.SQLDialectTypeSerializer;
import com.almuradev.ge.database.generated.tables.TblGe;
import com.google.common.reflect.TypeToken;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ninja.leaping.configurate.ConfigurationOptions;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;
import ninja.leaping.configurate.objectmapping.serialize.TypeSerializers;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonProxy {

    private MappedConfigurationAdapter<ModConfiguration> configurationAdapter;

    protected void onConstruction(FMLConstructionEvent event) {
        this.loadConfig();

        final ConnectionCategory connectionCategory = configurationAdapter.getConfig().connection;
        final String target = String.format("jdbc:%s://%s:%d/%s", connectionCategory.connector.getName().toLowerCase(), connectionCategory.server,
                connectionCategory.port, connectionCategory.database);
        try (Connection connection = DriverManager.getConnection(target, connectionCategory.user, connectionCategory.password)) {
            final DSLContext create = DSL.using(connection, connectionCategory.connector);

            create.insertInto(TblGe.TBL_GE)
                    .set(TblGe.TBL_GE.NAME, "banana")
                    .execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void onPreInitialization(FMLPreInitializationEvent event) {

    }

    protected void onInitialization(FMLInitializationEvent event) {

    }

    protected void loadConfig() {
        TypeSerializers.getDefaultSerializers().registerType(TypeToken.of(SQLDialect.class), new SQLDialectTypeSerializer());

        this.configurationAdapter = new MappedConfigurationAdapter<>(
                ModConfiguration.class,
                ConfigurationOptions.defaults(),
                Constants.Filesystem.PATH_CONFIG_GE,
                Constants.Filesystem.CONFIG_MOD_NAME);

        try {
            if (Files.notExists(configurationAdapter.getConfigFolder())) {
                Files.createDirectories(configurationAdapter.getConfigFolder());
                this.configurationAdapter.save();
            }

            this.configurationAdapter.load();
        } catch (IOException | ObjectMappingException e) {
            throw new RuntimeException("Failed to save config for class [" + this.configurationAdapter.getConfigClass() + "] in [" +
                    this.configurationAdapter.getConfigPath() + "]!", e);
        }
    }
}
