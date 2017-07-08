/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge.util;

import com.google.common.collect.Maps;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.plugin.PluginContainer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Commands {

    private static final Map<List<String>, CommandSpec> CHILDREN = Maps.newHashMap();

    /**
     * Add a child command with aliases.
     * @param child The child command.
     * @param aliases The child aliases to register with.
     */
    public static void add(CommandSpec child, String... aliases) {
        CHILDREN.put(Arrays.asList(aliases), child);
    }

    /**
     * Register commands using only the {@link PluginContainer}'s name as an alias.
     * @param container The {@link PluginContainer}.
     */
    public static void register(PluginContainer container) {
        register(container, container.getId().toLowerCase());
    }

    /**
     * Register commands with aliases.
     * @param container The {@link PluginContainer}.
     * @param aliases The master aliases to register with.
     */
    public static void register(PluginContainer container, String... aliases) {
        Sponge.getCommandManager().register(container, CommandSpec.builder().children(CHILDREN).build(), aliases);
    }
}
