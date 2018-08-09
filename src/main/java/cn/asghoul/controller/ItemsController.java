package cn.asghoul.controller;

import cn.asghoul.pojo.Client;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;
import cn.asghoul.service.ItemsService;
import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
@RequestMapping(value = "Items")
public class ItemsController {

    @Autowired
     private ItemsService itemsService;

    @ResponseBody
    @RequestMapping(value = "selectAllitem")
    public ModelAndView selectAllitem( int itemId){


           //根据商品Id查询商品信息
            List<Items> items=itemsService.getselectItems(itemId);
         //根据商品Id查询商品图片信息
           List<PicItem> picItem=itemsService.getselectPicItem(itemId);
           //根据用户Id查询收货人信息
          List<Client> client=itemsService.getselectClient(itemId);
           //把结果传递给页面
            ModelAndView model=new ModelAndView();
            model.addObject("items",items);
            model.addObject("picItem",picItem);
            model.addObject("client",client);
            model.setViewName("index");
            //返回逻辑视图
            return model;
    }



}


