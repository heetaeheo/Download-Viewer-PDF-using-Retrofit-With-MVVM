package com.example.downloadpdfapp

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface RetrofitService {

    @GET
    fun downloadPdfFile(@Url pdfUrl : String ) : Call<ResponseBody>


}