/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
package com.almuradev.ge.database;

import com.almuradev.ge.GE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    public DatabaseManager() {

    }

    private void connect(String url, String username, String password) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

        } catch (SQLException e) {
            GE.INSTANCE.getLogger().error("Unable to connect to GE database!", e);
        }
    }
}
