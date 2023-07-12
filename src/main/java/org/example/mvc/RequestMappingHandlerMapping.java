package org.example.mvc;

import org.example.mvc.cotroller.Controller;
import org.example.mvc.cotroller.HomeController;
import org.example.mvc.cotroller.UserCreateController;
import org.example.mvc.cotroller.UserListController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void init(){
        mappings.put("/", new HomeController());
        mappings.put("/users", new UserListController());
//        mappings.put("/users", new UserCreateController());
    }

    public Controller findHandler(String urlPath) {
        return mappings.get(urlPath);
    }
}
