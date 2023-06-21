/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.List;
import pos.layered.dto.ItemDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class ItemController {
    
    ItemService itemService = (ItemService) ServiceFactory.getServiceFactory().getService(ServiceFactory.serviceType.ITEM);
   
    public String addItem(ItemDto itemDto) throws Exception{
        return itemService.addItem(itemDto);
    }

    public List<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItems();
    }

    public ItemDto getItem(Integer id) throws Exception  {
        return itemService.getItem(id);
    }

    public String updateItem(ItemDto item) throws Exception {
        return itemService.updateItem(item);
    }

    public String deleteItem(int id) throws Exception {
        return itemService.deleteItem(id);
    }
}
