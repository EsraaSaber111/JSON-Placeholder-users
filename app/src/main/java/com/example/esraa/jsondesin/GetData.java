package com.example.esraa.jsondesin;


import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface GetData {

//Specify the request type and pass the relative URL//

    @GET("/users")

//Wrap the response in a Call object with the type of the expected result//

    Call<List<RetroUsers>> getAllUsers();
}