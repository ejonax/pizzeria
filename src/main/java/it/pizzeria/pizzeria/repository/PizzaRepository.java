package it.pizzeria.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pizzeria.pizzeria.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
