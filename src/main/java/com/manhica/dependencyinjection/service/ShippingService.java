package com.manhica.dependencyinjection.service;

import com.manhica.dependencyinjection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if (order.getBasic() < 100){
            return 20;
        }else if(order.getBasic() >= 200){
            return 0;
        }else {
            return 12;
        }
    }
}
