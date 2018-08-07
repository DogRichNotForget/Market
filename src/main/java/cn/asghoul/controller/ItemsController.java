package cn.asghoul.controller;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;
import cn.asghoul.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import java.util.List;

@Controller
@RequestMapping("")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @ResponseBody
    @RequestMapping(value = "selectItems")
    public List<Items> selectItems(long itemId) {

        List<Items> items= itemsService.selectItems(itemId);
        return items;

    }
    @ResponseBody
    @RequestMapping(value="selectPic")
    public List<PicItem> selectPic(long picId){
        List<PicItem> picItems=itemsService.selectPic(picId);
        return picItems;
    }
}


