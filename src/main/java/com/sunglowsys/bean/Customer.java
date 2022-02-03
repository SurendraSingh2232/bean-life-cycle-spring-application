package com.sunglowsys.bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Customer {
    private String custId;
    private String name;
    private String email;
    private String mobile;

    public Customer(){
        System.out.println("customer object created");
    }

    public Customer(String custId, String name, String email, String mobile) {
        this.custId = custId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getCustId() {
        return custId;
    }
    @Value("SGS112")
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }
    @Value("HIRDESH KUMAR")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @Value("hk@gmail.com")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }
    @Value("6397078496")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    //use annotation or initilization
    @Bean
    @PostConstruct
    public void init(){
        System.out.println("initilize the object");
    }
    //use annotation for destroy
    @Bean
    @PreDestroy
    public void destroy(){
        System.out.println("destroy the object");
    }


    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
