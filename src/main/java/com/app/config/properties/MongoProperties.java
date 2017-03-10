package com.app.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lenovo on 2017/3/10.
 */
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoProperties {
    private String host;
   // private int port = DBPort.PORT;
    private String uri = "mongodb://localhost/test";
    private String database;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}

