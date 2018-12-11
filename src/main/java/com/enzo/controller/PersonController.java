package com.enzo.controller;

import com.enzo.entity.Person;
import com.enzo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired(required=false)
    private PersonService personService;
    @RequestMapping("/selectPerson")
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        long personId = Long.parseLong(request.getParameter("id"));
        Person person =personService.findPersonById(personId);
        System.out.println("--------------person"+person);
    }
}