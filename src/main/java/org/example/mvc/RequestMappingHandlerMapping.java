package org.example.mvc;

import org.example.mvc.cotroller.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping implements HandlerMapping{
    private static final Logger log = LoggerFactory.getLogger(RequestMappingHandlerMapping.class);
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init(){
        log.info("rmhm init()");
        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form"));
    }

    public Controller findHandler(HandlerKey handlerKey) {
//        log.info("findHandler. key = {}", handlerKey);
        return mappings.get(handlerKey);
    }
}
