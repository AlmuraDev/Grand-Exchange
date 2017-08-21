/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge;

import com.google.inject.Inject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.slf4j.Logger;

@Mod(modid = Constants.Plugin.ID, name = Constants.Plugin.NAME, version = Constants.Plugin.VERSION)
public class GE {

    @Mod.Instance
    public static GE INSTANCE;

    @SidedProxy(clientSide = Constants.Plugin.PROXY_CLIENT_CLASSPATH, serverSide = Constants.Plugin.PROXY_SERVER_CLASSPATH)
    public static CommonProxy proxy;

    @Inject
    private Logger logger;

    @Mod.EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        this.proxy.onConstruction(event);
    }

    @Mod.EventHandler
    public void onPreInitialization(FMLPreInitializationEvent event) {
        this.proxy.onPreInitialization(event);
    }

    @Mod.EventHandler
    public void onInitialization(FMLInitializationEvent event) {
        this.proxy.onInitialization(event);
    }

    public final Logger getLogger() {
        return this.logger;
    }
}
