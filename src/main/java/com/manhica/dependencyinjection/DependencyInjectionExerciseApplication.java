package com.manhica.dependencyinjection;

import com.manhica.dependencyinjection.entities.Order;
import com.manhica.dependencyinjection.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionExerciseApplication implements CommandLineRunner {

    private OrderService orderService;

    public DependencyInjectionExerciseApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionExerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 20);
        Order order2 = new Order(2282, 800.00, 10);
        Order order3 = new Order(1309, 95.90, 0);

        System.out.println("Order number: " + order1.getCode());
        System.out.println("Total value: " + orderService.total(order1));
        System.out.println("---------------");
        System.out.println("Order number: " + order2.getCode());
        System.out.println("Total value: " + orderService.total(order2));
        System.out.println("---------------");
        System.out.println("Order number: " + order3.getCode());
        System.out.println("Total value: " + orderService.total(order3));
    }
}
