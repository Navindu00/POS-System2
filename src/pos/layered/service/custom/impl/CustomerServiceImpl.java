/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = (CustomerDao) DaoFactory.getDaoFactory().getDao(DaoFactory.DaoTypes.CUSTOMER);
    
    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        if(customerDao.add(new CustomerEntity(customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getEmail(),customerDto.getPostalCode()))){
            return "Successfully Added";
        } else{
            return "Failed";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        if(customerDao.update(new CustomerEntity(customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getEmail(),customerDto.getPostalCode()))){
            return "Successfully Updated";
        } else{
            return "Failed";
        }
    }

    @Override
    public String deleteCustomer(Integer id) throws Exception {
        if(customerDao.delete(id)){
            return "Successfully Deleted";
        }else{
            return "Failed";
        }
    }

    @Override
    public CustomerDto getCustomer(Integer id) throws Exception {
        CustomerEntity customerEntity =  customerDao.get(id);
        return new CustomerDto (customerEntity.getId(),customerEntity.getName(),customerEntity.getAddress(),customerEntity.getEmail(),customerEntity.getPostalCode());
    }

    @Override
    public List<CustomerDto> getAllCustomers() throws Exception {
        List<CustomerEntity> customerEntities = customerDao.getAll();
        List<CustomerDto> customerDtos = new ArrayList<>();
        
        for(CustomerEntity customerEntity: customerEntities){
            customerDtos.add(new CustomerDto(customerEntity.getId(),customerEntity.getName(),customerEntity.getAddress(),customerEntity.getEmail(),customerEntity.getPostalCode()));
        }
        
        return customerDtos;
    }
    
}
