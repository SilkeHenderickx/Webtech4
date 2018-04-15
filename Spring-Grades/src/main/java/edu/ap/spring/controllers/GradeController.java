package edu.ap.spring.controllers;

import edu.ap.spring.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ap.spring.model.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GradeController {

    GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @RequestMapping("/")
    public String grade(){
        return "grade";
    }

    @RequestMapping("/list")
    public String list(Model model){

        model.addAttribute("grades", gradeService.findAll());

        return "list";
    }

    @PostMapping("/grade")
    public String addGrade(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("grade") int grade,
                           Model model){

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("grade", grade);
        gradeService.save(new Grade(firstName, lastName, grade));


        return "result";
    }

}
