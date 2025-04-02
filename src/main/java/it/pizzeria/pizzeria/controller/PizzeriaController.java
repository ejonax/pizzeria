package it.pizzeria.pizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.pizzeria.pizzeria.model.Pizza;
import it.pizzeria.pizzeria.repository.PizzaRepository;

@Controller
@RequestMapping("/pizze")
public class PizzeriaController {

   @Autowired
   private PizzaRepository pizzaRepository;

    @GetMapping
    public String index(Model model) {
        List<Pizza> result=pizzaRepository.findAll();
        model.addAttribute("listaPizze",result);

        return "/pizze/index";
    }
    
}
