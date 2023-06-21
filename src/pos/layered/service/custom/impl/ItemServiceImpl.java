/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.ItemDto;
import pos.layered.entity.ItemEntity;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class ItemServiceImpl implements ItemService{

    ItemDao itemDao = (ItemDao) DaoFactory.getDaoFactory().getDao(DaoFactory.DaoTypes.ITEM);
     
    @Override
    public String addItem(ItemDto itemDto) throws Exception {
        if(itemDao.add(new ItemEntity(itemDto.getId(),itemDto.getName(), itemDto.getUnitPrice(),itemDto.getQuantity()))){
            return "Successfully Added";
        }else{
            return "Failed";
        }
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        if(itemDao.update(new ItemEntity(itemDto.getId(),itemDto.getName(), itemDto.getUnitPrice(),itemDto.getQuantity()))){
            return "Successfully Updated";
        }else{
            return "Failed";
        }
    }

    @Override
    public String deleteItem(Integer id) throws Exception {
        if(itemDao.delete(id)){
            return "Successfully Deleted";
        }else{
            return "Failed";
        }
    }

    @Override
    public ItemDto getItem(Integer id) throws Exception {
        ItemEntity itemEntity = itemDao.get(id);
        return new ItemDto(itemEntity.getId(), itemEntity.getName(), itemEntity.getUnitPrice(), itemEntity.getQuantity());
    }

    @Override
    public List<ItemDto> getAllItems() throws Exception {
        List<ItemEntity> itemEntities = itemDao.getAll();
        List<ItemDto> itemDtos = new ArrayList<>();
        
        for (ItemEntity itemEntity : itemEntities){
            itemDtos.add(new ItemDto(itemEntity.getId(), itemEntity.getName(), itemEntity.getUnitPrice(), itemEntity.getQuantity()));
        }
        
        return itemDtos;
    }
    
}
