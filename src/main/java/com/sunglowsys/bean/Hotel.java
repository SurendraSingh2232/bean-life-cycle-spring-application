package com.sunglowsys.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Hotel implements InitializingBean, DisposableBean {
    private String code;
    private String name;
    private String hotelType;
    private String email;
    private String mobile;

    public Hotel(){
        System.out.println("Hotel object is created");

    }

    public String getCode() {
        return code;
    }
    @Value("CLH123")
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    @Value("GALEXY")
    public void setName(String name) {
        this.name = name;
    }

    public String getHotelType() {
        return hotelType;
    }
    @Value(" * * * * *")
    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getEmail() {
        return email;
    }
    @Value("clh@gmail.com")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }
    @Value("76886868677")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy the object");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initilize the object");

    }
    @Override
    public String toString() {
        return "Hotel{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
