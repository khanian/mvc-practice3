package org.example.mvc.cotroller;

import org.example.mvc.Repository.UserRepository;
import org.example.mvc.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserCreateController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserRepository.save(new User(request.getParameter("userId"), request.getParameter("name")));
        return "redirect:/users";
    }
}
