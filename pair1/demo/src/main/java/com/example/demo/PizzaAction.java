package com.example.demo;

import org.springframework.data.repository.CrudRepository;


public interface PizzaAction extends CrudRepository<Pizza, Integer> {
}
