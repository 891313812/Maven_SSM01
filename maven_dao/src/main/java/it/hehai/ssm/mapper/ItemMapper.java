package it.hehai.ssm.mapper;

import it.hehai.ssm.pojo.Item;

public interface ItemMapper {
    /***
     * 根据id查询产品
     */
   Item findItemById(Integer id);
}
