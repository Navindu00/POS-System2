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
import pos.layered.dao.custom.ItemDao;
import pos.layered.entity.ItemEntity;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?)", t.getId(), t.getName(), t.getUnitPrice(), t.getQuantity());

    }

    @Override
    public boolean update(ItemEntity t) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE item SET name = ?, unit_price = ?, quantity = ? WHERE item_id = ?", t.getName(), t.getUnitPrice(), t.getQuantity(),t.getId());
    }

    @Override
    public boolean delete(Integer id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE item_id = ?",id);
    }

    @Override
    public ItemEntity get(Integer id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM item WHERE item_id = ? ", id);
        while(resultSet.next()){
            return new ItemEntity(resultSet.getInt("item_id"), 
                  resultSet.getString("name"), 
                  resultSet.getDouble("unit_price"), 
                  resultSet.getInt("quantity"));
        } 
        return null;
    }

    @Override
    public List<ItemEntity> getAll() throws SQLException, ClassNotFoundException {
       ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM item");
               
        List<ItemEntity> itemEntities = new ArrayList<>();
        while(resultSet.next()){
            itemEntities.add(new ItemEntity(resultSet.getInt("item_id"), 
                  resultSet.getString("name"), 
                  resultSet.getDouble("unit_price"), 
                  resultSet.getInt("quantity")));
        }
        
        return itemEntities;
    }
}


    

