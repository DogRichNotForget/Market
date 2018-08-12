package cn.asghoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderStateController {

    @ResponseBody
    @RequestMapping("/action")
    public ModelAndView OrderState()
    {
        return null;
    }
}
