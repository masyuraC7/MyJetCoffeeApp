package com.mc7.myjetcoffeeapp.data.model

import com.mc7.myjetcoffeeapp.R

data class MenuEntity(
    val image: Int,
    val title: String,
    val price: String,
)

val dummyMenu = listOf(
    MenuEntity(R.drawable.menu1, "Tiramisu Coffee Milk", "Rp 28.000"),
    MenuEntity(R.drawable.menu2, "Pumpkin Spice Latte", "Rp 18.000"),
    MenuEntity(R.drawable.menu3, "Light Cappuccino", "Rp 20.000"),
    MenuEntity(R.drawable.menu4, "Choco Creamy Latte", "Rp 16.000"),
)

val dummyBestSellerMenu = dummyMenu.shuffled()