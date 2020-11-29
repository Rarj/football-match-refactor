package rio.arj.infootball.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import rio.arj.infootball.di.service.ApiService

class NetworkBuilder {

  fun getApiService(): ApiService {
    return Retrofit.Builder()
      .baseUrl("https://www.thesportsdb.com/api/v1/json/1/")
      .addConverterFactory(GsonConverterFactory.create())
      .addCallAdapterFactory(CoroutineCallAdapterFactory())
      .build()
      .create(ApiService::class.java)
  }

}