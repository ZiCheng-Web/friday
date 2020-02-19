package com.zicheng.friday.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 子诚
 * Description：
 * 时间：2020/2/19 17:08
 */
@Controller
@RequestMapping("${api-url}")
public class ApiController {

    @RequestMapping(value="/getPage")
    public ModelAndView getPage(ModelAndView modelAndView, String pageName){
        modelAndView.setViewName(pageName);
        return modelAndView;
    }

}

