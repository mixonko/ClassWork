package com.pvt.cleanproject.data.repository.vehicle

import com.google.gson.Gson
import com.pvt.cleanproject.data.BuildConfig
import com.pvt.cleanproject.data.entity.VehiclePoiResponse
import com.pvt.cleanproject.domein.entity.vehicle.CoordinateParam
import com.pvt.cleanproject.domein.entity.vehicle.Vehicle
import com.pvt.cleanproject.domein.repository.vehicle.VehicleRepository
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import java.io.IOException

class VehicleRepositoryRemote(private val url: String) : VehicleRepository {
    private val CAR_SERVICE_URL = "http://kiparo.ru/t/fake-api/car-service.php"
    override fun fetch(param: CoordinateParam): List<Vehicle> {

        val httpUrlBuilder = HttpUrl.parse(url)?.newBuilder()
        httpUrlBuilder?.addQueryParameter("p1Lat", param.lat1.toString())
        httpUrlBuilder?.addQueryParameter("p1Lon", param.lon1.toString())
        httpUrlBuilder?.addQueryParameter("p2Lat", param.lat2.toString())
        httpUrlBuilder?.addQueryParameter("p2Lon", param.lon2.toString())


        val clientBuilder = OkHttpClient.Builder()


        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            clientBuilder.addInterceptor(loggingInterceptor)
        }
        val okhttp = clientBuilder.build()


        val request = Request.Builder()
            .url(httpUrlBuilder?.build())
            .build();

        val responce = okhttp.newCall(request).execute()

        val body = responce.body()?.string()

        val gson = Gson()

        val vehicleResponse = gson.fromJson<VehiclePoiResponse>(body, VehiclePoiResponse::class.java)

        return emptyList()


    }


}