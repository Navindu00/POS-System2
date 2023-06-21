/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public interface CrudDao<T, ID> extends SuperDao{
    boolean add(T t) throws SQLException, ClassNotFoundException;
    boolean update(T t) throws SQLException, ClassNotFoundException;
    boolean delete(ID id) throws SQLException, ClassNotFoundException;
    T get(ID id) throws SQLException, ClassNotFoundException;
    List<T> getAll() throws SQLException, ClassNotFoundException;
}
