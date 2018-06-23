package it.hehai.ssm.controller;

import it.hehai.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("item")
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("show")
    public ModelAndView findItemById(Integer id){
        ModelAndView view=new ModelAndView("viewItem");

        view.addObject("item",itemService.findItemById(id));

        return view;
    }

}
