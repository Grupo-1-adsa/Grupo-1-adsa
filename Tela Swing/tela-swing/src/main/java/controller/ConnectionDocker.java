package controller;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionDocker {

    private BasicDataSource dataSource;

    public ConnectionDocker() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://0.0.0.0:3306/proc?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}

