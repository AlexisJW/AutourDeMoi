package com.alexis.autourdemoi.data.remote;

import com.alexis.autourdemoi.data.remote.models.PlaceDetailResponse;
import com.alexis.autourdemoi.data.remote.models.PlacesRadiusResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenTripMapService {
    @GET("0.1/en/places/radius")
    Call<PlacesRadiusResponse> getPlacesByRadius(
            @Query("lon") double lon,
            @Query("lat") double lat,
            @Query("radius") int radius,
            @Query("kinds") String kinds,
            @Query("apikey") String apiKey,
            @Query("format") String format
    );

    @GET("0.1/en/places/xid")
    Call<PlaceDetailResponse> getPlaceDetail(
            @Query("xid") String xid,
            @Query("apikey") String apiKey
    );
}
