package com.example.chucknorrisjokes.networkPackage;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesApi {

    @GET("jokes/random/20")
    Call<GetAllJokes> getAllJokes();
}
