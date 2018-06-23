package it.hehai.ssm.service;

import it.hehai.ssm.pojo.Item;

public interface ItemService {

    /***
     * 根据id查询产品
     */
    Item findItemById(Integer id);
}
