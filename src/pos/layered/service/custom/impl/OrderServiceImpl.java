/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.sql.Connection;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dao.custom.OrderDao;
import pos.layered.dao.custom.OrderDetailDao;
import pos.layered.db.DbConnection;
import pos.layered.dto.OrderDetailDto;
import pos.layered.dto.OrderDto;
import pos.layered.entity.ItemEntity;
import pos.layered.entity.OrderDetailEntity;
import pos.layered.entity.OrderEntity;
import pos.layered.service.custom.OrderService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = (OrderDao) DaoFactory.getDaoFactory().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getDaoFactory().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
    private ItemDao itemdao = (ItemDao) DaoFactory.getDaoFactory().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {
        Connection connection = DbConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
            if (orderDao.add(new OrderEntity(orderDto.getOrderID(), orderDto.getOrderDate(), orderDto.getTotal(), orderDto.getCustomerID()))) {
                boolean isOrderDetailSaved = true;

                for (OrderDetailDto detailDto : orderDto.getDetailDtos()) {
                    if (!(orderDetailDao.add(new OrderDetailEntity(-1, detailDto.getUnitPrice(), detailDto.getQuantity(), orderDto.getOrderID(), detailDto.getItemID())))) {
                        isOrderDetailSaved = false;
                    }
                }

                if(isOrderDetailSaved){
                    
                    boolean isItemDetailSaved = true;
                    
                    for(OrderDetailDto detailDto : orderDto.getDetailDtos()){
                        ItemEntity entity = itemdao.get(detailDto.getItemID());
                        entity.setQuantity(entity.getQuantity() - detailDto.getQuantity());
                        if(!(itemdao.update(entity))){
                            isItemDetailSaved = false;
                        }
                    }
                    
                    if(isItemDetailSaved){
                        connection.commit();
                        return "Success";
                    }else{
                        connection.rollback();
                        return "Item Update Error";
                    }
                    
                    
                }else{
                    connection.rollback();
                    return "Order Details Save Error";
                }
            }else{
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

}
