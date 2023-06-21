/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.OrderDao;
import pos.layered.entity.OrderEntity;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws SQLException, ClassNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return CrudUtil.executeUpdate("INSERT INTO orders VALUES (?,?,?,?)", t.getOrderID(),sdf.format(t.getOrderDate()), t.getTotal(), t.getCustomerID());
    }

    @Override
    public boolean update(OrderEntity t) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(Integer id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderEntity get(Integer id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<OrderEntity> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
    
}
