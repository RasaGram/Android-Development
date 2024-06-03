package com.dicoding.rasagram.data.repository

import com.dicoding.rasagram.data.model.Dish

class DishRepository {
    fun getAllData(): List<Dish>{
        return listOf(
            Dish(
                id = 0,
                dish_name = "Lotek",
                description = "Lotek adalah makanan",
                preparation_time = 10,
                cooking_time = 10
            ),
            Dish(
                id = 1,
                dish_name = "Soto",
                description = "Soto adalah makanan",
                preparation_time = 10,
                cooking_time = 10
            ),
            Dish(
                id = 2,
                dish_name = "Ayam goreng",
                description = "Ayam goreng adalah makanan",
                preparation_time = 10,
                cooking_time = 10
            ),
            Dish(
                id = 3,
                dish_name = "Ayam bakar",
                description = "Ayam bakar adalah makanan",
                preparation_time = 10,
                cooking_time = 10
            ),

        )
    }
}