/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.entity.CustomerEntity;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES (?,?,?,?,?)", t.getId(), t.getName(), t.getAddress(),t.getEmail(), t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE customer SET name = ?, address = ?, email = ?, postal_code = ? WHERE customer_id = ?", t.getName(), t.getAddress(),t.getEmail(), t.getPostalCode(), t.getId() );
    }

    @Override
    public boolean delete(Integer id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE customer_id = ? ",id);
    }

    @Override
    public CustomerEntity get(Integer id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM customer WHERE customer_id = ? ", id);
        
        while(resultSet.next()){
            return new CustomerEntity(resultSet.getInt("customer_id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("address"),
                    resultSet.getString("postal_code"));
        } 
        return null;
    }

    @Override
    public List<CustomerEntity> getAll() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM customer");
        List<CustomerEntity>  customerEntities = new ArrayList<>();
        
        while (resultSet.next()) {
            CustomerEntity customerEntity = new CustomerEntity(resultSet.getInt("customer_id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("address"),
                    resultSet.getString("postal_code"));

            customerEntities.add(customerEntity);

        }

        return customerEntities;
    }
    
}
