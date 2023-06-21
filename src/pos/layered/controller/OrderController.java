/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import pos.layered.dto.OrderDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.OrderService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderController {

    OrderService orderService = (OrderService) ServiceFactory.getServiceFactory().getService(ServiceFactory.serviceType.ORDER);
    
    public String placeOrder(OrderDto order) throws Exception {
        return orderService.placeOrder(order);
    }
    
}
