/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.looca2.controller;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author meuno
 */
public class Connection {
    private BasicDataSource dataSource;

    public Connection(){
        dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://procrastinator.database.windows.net:1433;database=procrastinator;user=procrastinator@procrastinator;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("procrastinator");
        dataSource.setPassword("#Gfgrupo1");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
