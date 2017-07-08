/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge.util;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Storage {

    private static final String PATH_SPLIT = "\\.";
    private static final String SUFFIX = " - Storage";
    private ConfigurationLoader<CommentedConfigurationNode> loader;
    private CommentedConfigurationNode rootNode;
    private final File configuration;
    private final Map<String, Object> defaultNodes = Maps.newTreeMap();
    private final Logger logger;

    public Storage(PluginContainer container, File configuration, ConfigurationLoader<CommentedConfigurationNode> loader) {
        this.logger = LoggerFactory.getLogger(container.getName() + SUFFIX);
        this.loader = loader;
        this.configuration = configuration;
        this.init();
    }

    /**
     * Initializes the configuration file. File is created if non-existant.
     * @return {@link Storage} for chaining.
     */
    public Storage init() {
        if (!this.configuration.exists()) {
            try {
                this.configuration.createNewFile();
            } catch (IOException e) {
                this.logger.error("Unable to create new configuration file!", e);
            }
        }
        try {
            this.rootNode = this.loader.load();
        } catch (IOException e) {
            this.logger.error("Unable to load configuration file!", e);
        }
        return this;
    }

    /**
     * Loads the configuration file.
     * @return {@link Storage} for chaining.
     */
    public Storage load() {
        this.defaultNodes.entrySet().stream().filter(entry -> entry.getValue() != null).forEach(entry -> {
            final CommentedConfigurationNode node = getChildNode(entry.getKey());
            if (node.getValue() == null) {
                this.getChildNode(entry.getKey()).setValue(entry.getValue());
            }
        });
        final Queue<CommentedConfigurationNode> queue = Queues.newConcurrentLinkedQueue();
        queue.add(this.rootNode);
        while (!queue.isEmpty()) {
            final CommentedConfigurationNode node = queue.remove();
            if (node.hasMapChildren()) {
                for (Map.Entry<Object, ? extends CommentedConfigurationNode> entry : node.getChildrenMap().entrySet()) {
                    queue.add(entry.getValue());
                }
            }
        }
        this.save();
        try {
            this.loader.load();
        } catch (IOException e) {
            this.logger.error("Unable to load configuration!", e);
        }
        return this;
    }

    /**
     * Saves the configuration file.
     * @return {@link Storage} for chaining.
     */
    public Storage save() {
        try {
            this.loader.save(this.rootNode);
        } catch (IOException e) {
            this.logger.error("Unable to save configuration!", e);
        }
        return this;
    }

    /**
     * Registers a default node. Calls {@link Storage#save()} and {@link Storage#load()}.
     * @param path The path to register.
     * <p>The path is split by a period for example "path.to.node" is the equivalent of...
     * path {
     *     to {
     *         node=""
     *     }
     * }</p>
     * @param value The value to register.
     */
    public void registerDefaultNode(String path, Object value) {
        final String[] nodes = path.split(PATH_SPLIT);
        final List<String> currentPath = Lists.newArrayList();
        for (int i = 0; i < nodes.length; i++) {
            if (i < nodes.length - 1) {
                currentPath.add(i, nodes[i]);
                final String joinedPath = Joiner.on(",").skipNulls().join(currentPath).replace(",", ".");
                this.defaultNodes.put(joinedPath, null);
            } else {
                this.defaultNodes.put(path, value);
            }
        }
        this.save();
        this.load();
    }

    /**
     * Gets the node from the root node.
     * @param path The path to the node split by periods.
     * @return The {@link CommentedConfigurationNode}.
     */
    public CommentedConfigurationNode getChildNode(String path) {
        return this.rootNode.getNode((Object[]) path.split(PATH_SPLIT));
    }
}
