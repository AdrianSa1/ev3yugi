package com.adrian.ec3.santiago.model

data class Card(
    val name: String,
    val type: String,
    val race: String,
    val attribute:String,
    val card_images: List<CardImage>

)

data class CardImage(
    val image_url: String
)

