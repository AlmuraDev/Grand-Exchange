/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge.configuration.category;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;
import org.jooq.SQLDialect;

@ConfigSerializable
public class ConnectionCategory {

    @Setting(value = "server", comment = "The server IP address that holds the SQL-based server instance.")
    public String server = "localhost";

    @Setting(value = "port", comment = "The port to use when connecting to the IP address.")
    public int port = 3306;

    @Setting(value = "database", comment = "The database to use on the target server.")
    public String database = "ge_dev";

    @Setting(value = "user", comment = "The user to use when connecting to the database.")
    public String user = "root";

    @Setting(value = "password", comment = "The password to use when connecting to the database.")
    public String password = "";

    @Setting(value = "connector", comment = "The connection type to use.")
    public SQLDialect connector = SQLDialect.MYSQL;
}
