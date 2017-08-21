/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge.configuration;

import com.almuradev.ge.configuration.category.ConnectionCategory;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ModConfiguration extends AbstractConfiguration {

    @Setting(value = "connection")
    public final ConnectionCategory connection = new ConnectionCategory();
}
