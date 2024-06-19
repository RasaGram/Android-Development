package com.dicoding.rasagram.data.repository

import com.dicoding.rasagram.R
import com.dicoding.rasagram.data.model.Dish

class DishRepository {
    fun getAllData(): List<Dish>{
        return listOf(
            Dish(
                id = 0,
                dish_name = "Ayam Bakar",
                ingredients = "Ayam, Bumbu Ayam Bakar, Minyak, Jeruk Nipis",
                description = "Siapkan ayam, lumuri dengan bumbu ayam bakar, dan panggang hingga matang.",
                image = R.drawable.ayambakar
            ),
            Dish(
                id = 1,
                dish_name = "Ayam Goreng",
                ingredients = "Ayam, Tepung bumbu, Minyak goreng, Bawang putih",
                description = "Goreng ayam hingga kuning keemasan, sajikan dengan nasi dan sambal.",
                image = R.drawable.ayamgoreng
            ),
            Dish(
                id = 2,
                dish_name = "Bakso",
                ingredients = "Daging sapi cincang, Tepung tapioka, Bawang putih, Merica",
                description = "Campur daging sapi cincang dengan bahan lain, buat bulatan, dan rebus dalam air mendidih.",
                image = R.drawable.bakso
            ),
            Dish(
                id = 3,
                dish_name = "Bakwan",
                ingredients = "Wortel, Bawang putih, Tepung terigu, Bawang merah",
                description = "Campur semua bahan, aduk rata, goreng hingga matang dan keemasan.",
                image = R.drawable.bakwan
            ),
            Dish(
                id = 4,
                dish_name = "Batagor",
                ingredients = "Tahu, Ikan tenggiri cincang, Tepung terigu, Kecap manis",
                description = "Campur ikan tenggiri cincang dengan bumbu, isi tahu dengan adonan, dan goreng hingga matang.",
                image = R.drawable.batagor
            ),
            Dish(
                id = 5,
                dish_name = "Bihun",
                ingredients = "Bihun, Ayam cincang, Kol, Wortel, Kecap manis",
                description = "Rebus bihun, tumis ayam dan sayuran, tambahkan kecap manis sesuai selera.",
                image = R.drawable.bihun
            ),
            Dish(
                id = 6,
                dish_name = "Capcay",
                ingredients = "Sayuran segar, Ayam rebus, Jamur kuping, Bawang putih",
                description = "Tumis bawang putih dengan sedikit minyak, masukkan sayuran dan ayam, tumis hingga matang.",
                image = R.drawable.capcay
            ),
            Dish(
                id = 7,
                dish_name = "Gado-Gado",
                ingredients = "Ketimun, Tahu goreng, Kacang tanah, Telur rebus, Bumbu kacang",
                description = "Campur semua bahan, siram dengan bumbu kacang, sajikan dengan kerupuk.",
                image = R.drawable.gado
            ),
            Dish(
                id = 8,
                dish_name = "Ikan Goreng",
                ingredients = "Ikan segar, Tepung bumbu, Minyak goreng, Jeruk nipis",
                description = "Goreng ikan hingga matang, beri perasan jeruk nipis sebelum disajikan.",
                image = R.drawable.ikangoreng
            ),
            Dish(
                id = 9,
                dish_name = "Kerupuk",
                ingredients = "Tepung terigu, Air, Minyak goreng, Garam",
                description = "Campur tepung terigu dengan air dan garam, goreng dalam minyak panas hingga mengembang.",
                image = R.drawable.kerupuk
            ),
            Dish(
                id = 10,
                dish_name = "Martabak Telur",
                ingredients = "Tepung terigu, Telur, Daging cincang, Bawang merah, Bawang putih",
                description = "Campur semua bahan untuk kulit, isi dengan telur dan daging, goreng hingga matang.",
                image = R.drawable.martabak
            ),
            Dish(
                id = 11,
                dish_name = "Mie",
                ingredients = "Mie instan, Sayuran, Telur, Kecap manis, Bawang putih",
                description = "Rebus mie, tumis bawang putih dengan sedikit minyak, masukkan sayuran dan telur.",
                image = R.drawable.mie
            ),
            Dish(
                id = 12,
                dish_name = "Nasi Goreng",
                ingredients = "Nasi, Kecap manis, Bawang merah, Telur, Sayuran",
                description = "Panaskan minyak, tumis bumbu halus, daun salam, dan serai hingga harum.",
                image = R.drawable.nasigoreng
            ),
            Dish(
                id = 13,
                dish_name = "Nasi Putih",
                ingredients = "Beras, Air, Garam",
                description = "Cuci beras, masak dengan air hingga matang, sajikan sebagai pendamping hidangan.",
                image = R.drawable.nasi
            ),
            Dish(
                id = 14,
                dish_name = "Nugget",
                ingredients = "Daging ayam cincang, Tepung roti, Telur, Susu",
                description = "Campur daging ayam dengan bahan lain, bentuk bulatan, balurkan tepung roti, dan goreng hingga keemasan.",
                image = R.drawable.nugget
            ),
            Dish(
                id = 15,
                dish_name = "Opor Ayam",
                ingredients = "Ayam, Santan, Bumbu opor, Daun salam, Serai",
                description = "Rebus ayam dengan bumbu dan santan hingga matang dan bumbu meresap.",
                image = R.drawable.opor
            ),
            Dish(
                id = 16,
                dish_name = "Pempek",
                ingredients = "Ikan tenggiri cincang, Tepung sagu, Bumbu cuko, Telur, Bawang putih",
                description = "Campur ikan tenggiri cincang dengan bahan lain, bentuk adonan menjadi bulatan, rebus atau goreng, sajikan dengan cuko.",
                image = R.drawable.pempek
            ),
            Dish(
                id = 17,
                dish_name = "Rendang",
                ingredients = "Daging sapi, Santan, Bumbu rendang, Daun jeruk, Serai",
                description = "Rebus daging dengan bumbu dan santan hingga bumbu meresap dan daging empuk.",
                image = R.drawable.rendang
            ),
            Dish(
                id = 18,
                dish_name = "Roti",
                ingredients = "Tepung terigu, Air, Gula, Ragi",
                description = "Campur semua bahan, uleni hingga elastis, diamkan hingga mengembang, dan panggang hingga matang.",
                image = R.drawable.roti
            ),
            Dish(
                id = 19,
                dish_name = "Sate",
                ingredients = "Daging sapi, Bumbu kacang, Kecap manis, Jeruk nipis",
                description = "Tusuk daging dengan tusukan sate, panggang dengan bumbu kacang hingga matang.",
                image = R.drawable.sate
            ),
        )
    }

    fun getDishById(dishId: Int): Dish? {
        val allDishes = getAllData()
        return allDishes.find { it.id == dishId }
    }
}