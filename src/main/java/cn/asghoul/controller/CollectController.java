package cn.asghoul.controller;


import cn.asghoul.pojo.Collect;
import cn.asghoul.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigInteger;

@Controller
public class CollectController {

    @Autowired
    private CollectService collectService;
    /**
     * 添加新的商品到购物车
     * @param session
     */
    @RequestMapping( value = "insertCollect")
    @ResponseBody
    public String selectCollect( Collect collect, HttpSession session){

        int clientId=(int) session.getAttribute("clientId");
        String ss;
        if(clientId==0)
        {
             ss="NO" ;
        }else {
            collectService.getinsertCollect(collect.getCollectId(),clientId,collect.getItemType(),collect.getItemId(), collect.getItemName());
            ss="YES";
        }
        return ss;

    }
}
