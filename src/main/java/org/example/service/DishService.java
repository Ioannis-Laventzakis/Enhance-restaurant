package org.example.service;

import org.example.model.Dish;
import org.example.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepository repository;

    // save a new dish
    public Dish saveDish(Dish dish){
        return repository.save(dish);

        // get the most expensive dish
        public Dish getMostExpensiveDish(){
            return repository.findTopByOrderByPriceDesc();

            // get the lowest calories dish
            public Dish getLowestCaloriesDish(){
                return  repository.findTopByOrderByCaloriesAsc();

                // get a list dishes based on a specific ingredient.
                public List<Dish> getDishesByIngredient(String ingredient){
                    return repository.findByIngredientsContaining(ingredient);

                    // get a list of all dishes in the database
                    public List<Dish> getAllDishes(){
                        return repository.findAll();
                    }
        }
    }


}