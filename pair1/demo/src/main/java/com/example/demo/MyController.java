package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyController {
    @Autowired
    private PizzaAction pizzaAction;

    @GetMapping(path="/add")
    public @ResponseBody
    String add(@RequestParam String name,@RequestParam String maker,@RequestParam Integer size){
        Pizza pizza = new Pizza();
        pizza.setMaker(maker);
        pizza.setName(name);
        pizza.setSize(size);
        pizzaAction.save(pizza);

        return "Saved!";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Pizza> getAll() {
        return pizzaAction.findAll();
    }
}
