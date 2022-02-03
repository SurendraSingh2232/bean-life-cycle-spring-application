package com.sunglowsys;

import com.sunglowsys.bean.Customer;
import com.sunglowsys.bean.Hotel;
import com.sunglowsys.config.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Surendra Singh" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Customer customer = context.getBean(Customer.class);
        customer.getCustId();
        customer.getEmail();
        customer.getMobile();
        customer.getName();
        System.out.println(customer);
        System.out.println(customer.hashCode());

        //AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationContext.class);
        Hotel hotel = context.getBean(Hotel.class);
        hotel.getCode();
        hotel.getHotelType();
        hotel.getMobile();
        hotel.getName();
        hotel.getEmail();
        System.out.println(hotel);
        System.out.println(hotel.hashCode());

    }
}
