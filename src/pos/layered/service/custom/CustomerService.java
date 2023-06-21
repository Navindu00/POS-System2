/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import java.util.List;
import pos.layered.dto.CustomerDto;
import pos.layered.service.SuperService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(Integer id) throws Exception;
    CustomerDto getCustomer(Integer id) throws Exception;
    List<CustomerDto> getAllCustomers() throws Exception;
}
