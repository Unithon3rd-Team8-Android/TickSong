package com.unithon3rd.team8.ticksong.retrofit2Interface;

import com.unithon3rd.team8.ticksong.model.DTO.UserDTO;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
/**
 * Created by Daesub Kim on 2016-07-30.
 */
public interface LoginInterface {
    @FormUrlEncoded
    @POST("login.do")
    Call<UserDTO> requestLogin(
            @Field("loginId") String loginId,
            @Field("loginPwd") String loginPwd
    );
}
