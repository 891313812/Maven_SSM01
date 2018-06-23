package it.hehai.ssm.service.impl;

import it.hehai.ssm.mapper.ItemMapper;
import it.hehai.ssm.pojo.Item;
import it.hehai.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    /*
     * 根据id查询产品
     * @param id
     */
    @Override
    public Item findItemById(Integer id) {
        /*SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ItemMapper mapper = sqlSession.getMapper(ItemMapper.class);*/
        return itemMapper.findItemById(id);
    }
}
