package com.adrian.ec3.santiago.data.repository

import com.adrian.ec3.santiago.data.response.ListCardResponse
import com.adrian.ec3.santiago.data.retrofit.RetrofitHelper

class CardRepository {
    suspend fun getCards(): CardServiceResult<ListCardResponse> {
        return try {
            val response = RetrofitHelper.cardService.getAllNotes()
            CardServiceResult.Success(response)
        } catch (e: java.lang.Exception) {
            CardServiceResult.Error(e)
        }
    }

}
