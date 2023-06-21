/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service;

import pos.layered.service.custom.impl.CustomerServiceImpl;
import pos.layered.service.custom.impl.ItemServiceImpl;
import pos.layered.service.custom.impl.OrderServiceImpl;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getServiceFactory() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(serviceType type) {
        switch(type){
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ITEM:
                return new ItemServiceImpl();
            case ORDER:
                return new  OrderServiceImpl();
            default: 
                return null;
        } 
    }

    public enum serviceType {
        CUSTOMER, ITEM, ORDER
    }

}
