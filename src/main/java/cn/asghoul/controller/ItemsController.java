package cn.asghoul.controller;

import cn.asghoul.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @ResponseBody
    @RequestMapping(value = "selectItemsAs")
    public Map<String,Object> selectItemsAs(){

        return null;
    }

}
