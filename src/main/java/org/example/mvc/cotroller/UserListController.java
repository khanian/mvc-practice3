package org.example.mvc.cotroller;

import org.example.mvc.Repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserListController implements Controller{
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("Users", UserRepository.findAll());
        return "/user/list";
    }
}
