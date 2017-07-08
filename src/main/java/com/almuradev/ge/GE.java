/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge;

import com.almuradev.ge.util.Storage;
import com.google.inject.Inject;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameConstructionEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;

@Plugin(id = Constants.Plugin.ID, name = Constants.Plugin.NAME, version = Constants.Plugin.VERSION, description = Constants.Plugin.DESCRIPTION)
public class GE {

    public static GE INSTANCE;
    private Storage storage;
    @Inject private PluginContainer container;
    @Inject private Logger logger;
    @DefaultConfig(sharedRoot = true)
    @Inject private File configuration;
    @DefaultConfig(sharedRoot = true)
    @Inject private ConfigurationLoader<CommentedConfigurationNode> loader;

    @Listener
    public void onGameConstruction(GameConstructionEvent event) {
        INSTANCE = this;
        this.storage = new Storage(this.container, this.configuration, this.loader);
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Storage getStorage() {
        return this.storage;
    }

    public final PluginContainer getContainer() {
        return this.container;
    }
}
