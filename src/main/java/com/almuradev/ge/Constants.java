/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constants {

    public static final class Filesystem {

        public static final Path PATH_ROOT = Paths.get(".");
        public static final Path PATH_CONFIG = PATH_ROOT.resolve("config");
        public static final Path PATH_CONFIG_GE = PATH_CONFIG.resolve(Plugin.ID);

        public static final String CONFIG_MOD_NAME = Plugin.ID + ".conf";
    }

    public static final class Plugin {

        public static final String ID = "ge";
        public static final String NAME = "Grand Exchange";
        public static final String VERSION = "0.0.1";

        public static final String PROXY_CLIENT_CLASSPATH = "com.almuradev.ge.client.ClientProxy";
        public static final String PROXY_SERVER_CLASSPATH = "com.almuradev.ge.server.ServerProxy";
    }
}
