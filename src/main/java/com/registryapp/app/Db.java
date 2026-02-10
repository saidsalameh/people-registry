package com.registryapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class Db {
    private static final String DB_URL = "jdbc:sqlite:people.db";

    private Db() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    /** Call once at application startup */
    public static void init() {
        try (Connection conn = getConnection();
             Statement st = conn.createStatement()) {

            st.executeUpdate("""
                CREATE TABLE IF NOT EXISTS persons (
                  id INTEGER PRIMARY KEY AUTOINCREMENT,
                  lrc_id TEXT NOT NULL UNIQUE,
                  first_name TEXT NOT NULL,
                  last_name TEXT NOT NULL,
                  nickname TEXT,
                  mobile TEXT NOT NULL,
                  blood_type TEXT NOT NULL,
                  address TEXT,
                  email TEXT,
                  date_of_birth TEXT NOT NULL
                );
            """);

            st.executeUpdate("CREATE INDEX IF NOT EXISTS idx_persons_name ON persons(last_name, first_name);");
            st.executeUpdate("CREATE INDEX IF NOT EXISTS idx_persons_blood ON persons(blood_type);");

        } catch (SQLException e) {
            throw new RuntimeException("DB init failed", e);
        }
    }
}
