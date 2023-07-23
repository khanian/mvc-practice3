package org.example.mvc.cotroller;

import org.example.mvc.Repository.UserRepository;
import org.example.mvc.model.User;
import org.example.mvc.view.JspViewResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

public class UserListController implements Controller{
    private static final Logger log = LoggerFactory.getLogger(UserListController.class);
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Collection<User> all = UserRepository.findAll();
        log.info("all list = {}", all);
        request.setAttribute("users", UserRepository.findAll());

        return "/user/list";
    }
}
