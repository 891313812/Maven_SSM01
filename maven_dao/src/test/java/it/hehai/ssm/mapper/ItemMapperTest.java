package it.hehai.ssm.mapper;

import it.hehai.ssm.pojo.Item;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ItemMapperTest {

    @Test
    public void findItemById() {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        ItemMapper bean = context.getBean(ItemMapper.class);
        Item itemById = bean.findItemById(1);
        System.out.println(itemById);
    }
}