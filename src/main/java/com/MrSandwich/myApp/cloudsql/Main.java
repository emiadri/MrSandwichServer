package com.MrSandwich.myApp.cloudsql;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionPoolContextListener connectionPoolContextListener = new ConnectionPoolContextListener();
//        DataSource pool = connectionPoolContextListener.createConnectionPool();
//        connectionPoolContextListener.createTable(pool);
    }
}
