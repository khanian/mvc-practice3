package org.example.mvc.model;

import org.example.mvc.view.JspViewResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private static final Logger log = LoggerFactory.getLogger(User.class);
    private final String userId;
    private final String name;

    public User(String userId, String name) {
        log.info("userId={}, name={}", userId,name);
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
