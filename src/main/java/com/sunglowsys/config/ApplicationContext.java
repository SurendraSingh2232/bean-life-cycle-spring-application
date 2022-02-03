package com.sunglowsys.config;

import com.sunglowsys.bean.Customer;

import com.sunglowsys.bean.Hotel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {

    @Bean(name = "customer")
    public Customer getCustomer(){
        return new Customer();
    }
    @Bean(name = "hotel")
    public Hotel getHotel(){
        return new Hotel();
    }
}
