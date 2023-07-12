package org.example.mvc;

import org.example.mvc.cotroller.Controller;
import org.example.mvc.cotroller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void init(){
        mappings.put("/", new HomeController());
    }

    public Controller findHandler(String urlPath) {
        return mappings.get(urlPath);
    }
}
