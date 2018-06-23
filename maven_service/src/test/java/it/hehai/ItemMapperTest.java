package it.hehai;

import it.hehai.ssm.mapper.ItemMapper;
import it.hehai.ssm.pojo.Item;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemMapperTest {

    @Test
    public void findItemById() {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
        ItemMapper bean = context.getBean(ItemMapper.class);
        Item itemById = bean.findItemById(1);
        System.out.println(itemById);
    }
}