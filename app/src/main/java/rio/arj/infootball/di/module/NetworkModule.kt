package rio.arj.infootball.di.module

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import rio.arj.infootball.data.service.ApiService
import javax.inject.Singleton

@Module
class NetworkModule {

  @Provides
  @Singleton
  fun provideRetrofit(): ApiService {
    return Retrofit.Builder()
      .baseUrl("https://www.thesportsdb.com/api/v1/json/1/")
      .addConverterFactory(GsonConverterFactory.create())
      .addCallAdapterFactory(CoroutineCallAdapterFactory())
      .build()
      .create(ApiService::class.java)
  }

}