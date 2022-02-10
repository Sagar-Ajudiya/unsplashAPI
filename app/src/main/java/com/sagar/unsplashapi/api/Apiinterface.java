package com.sagar.unsplashapi.api;

import static com.sagar.unsplashapi.api.ApiUtilities.API_KEY;

import com.sagar.unsplashapi.model.ImageModel;
import com.sagar.unsplashapi.model.SearchModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Apiinterface {
    @Headers("Authorization: Client-ID "+API_KEY)
    @GET("photos")
    Call<List<ImageModel>> getImages(
            @Query("page") int page,
            @Query("per_page") int perPage
    );

    @Headers("Authorization: Client-ID "+API_KEY)
    @GET("/search/photos")
    Call<SearchModel> searchImages(
            @Query("query") String query
    );
}
