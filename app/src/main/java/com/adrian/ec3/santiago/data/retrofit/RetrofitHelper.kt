package com.adrian.ec3.santiago.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private val retrofit: Retrofit =
        Retrofit.Builder().baseUrl("https://db.ygoprodeck.com/api/v7/").addConverterFactory(
            GsonConverterFactory.create()).build()
    val cardService: CardService = retrofit.create(CardService::class.java)

}
// https://apisimpsons.fly.dev/api/personajes
// https://run.mocky.io/v3/580f7860-95d2-4a87-aa2c-361a8da46317