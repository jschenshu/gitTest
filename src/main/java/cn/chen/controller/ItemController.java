package cn.chen.controller;

import cn.chen.domain.Item;
import cn.chen.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/findDetail")
    public String getAll(Model model) {
        Item item = itemService.getItemById(1);
        model.addAttribute("item", item);
        return "itemDetail";
    }

}
