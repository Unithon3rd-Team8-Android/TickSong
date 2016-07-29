package com.unithon3rd.team8.ticksong.model.DTO;

import java.io.Serializable;

/**
 * Created by Daesub Kim on 2016-07-30.
 */
public class UserDTO implements Serializable {
    /**
     * 사용자의 userCode
     */
    private String uId;
    /**
     * 사용자 이메일
     */
    private String emailId;
    /**
     * 사용자 이름
     */
    private String name;
    /**
     * 사용자 패스워드.
     */
    private String pwd;
    /**
     * 회원가입한 시간.
     */
    private String reg_date;
    /**
     * 요청 성공여부.
     */
    private String resultCode;


    public UserDTO() {
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public UserDTO(String uId, String emailId, String name, String pwd, String reg_date, String resultCode) {

        this.uId = uId;
        this.emailId = emailId;
        this.name = name;
        this.pwd = pwd;
        this.reg_date = reg_date;
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "uId='" + uId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", reg_date='" + reg_date + '\'' +
                ", resultCode='" + resultCode + '\'' +
                '}';
    }
}

