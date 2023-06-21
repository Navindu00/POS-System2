/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.List;
import pos.layered.dto.CustomerDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.CustomerService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getServiceFactory().getService(ServiceFactory.serviceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(int id) throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(int id) throws Exception {
        return customerService.getCustomer(id);
    }

    public List<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomers();
    }
}
