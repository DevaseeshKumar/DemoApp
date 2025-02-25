package com.demo.app.controller;

import com.demo.app.model.Model;
import com.demo.app.service.ModelService;
import com.demo.app.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ModelController {

    @Autowired
    private ModelService modelService;

    @Autowired
    private EmailService emailService;

    // Show add model page
    @GetMapping("/addModel")
    public String showAddModelPage() {
        return "addModel";  // Matches addModel.jsp
    }

    // Handle form submission
    @PostMapping("/addModel")
    public String addModel(@RequestParam String name, @RequestParam String email) {
        Model model = new Model();
        model.setName(name);
        model.setEmail(email);
        modelService.addModel(model);

        emailService.sendEmail(email, "Registration Successful", "Welcome, " + name);
        return "redirect:/viewModels";
    }

    // Show all models
    @GetMapping("/viewModels")
    public String viewAllModels(ModelMap model) {
        List<Model> models = modelService.getAllModels();
        model.addAttribute("models", models);
        return "viewModels";  // Matches viewModels.jsp
    }
}
