package cn.com.eship.controller;


import cn.com.eship.models.ItfEntBaseInfo;
import cn.com.eship.service.HolographicPortraitService;
import cn.com.eship.service.ItfEntBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/holographicPortrait")
public class HolographicPortraitController {

    private final HolographicPortraitService holographicPortraitService;
    private final ItfEntBaseInfoService itfEntBaseInfoService;

    @Autowired
    public HolographicPortraitController(HolographicPortraitService holographicPortraitService,ItfEntBaseInfoService itfEntBaseInfoService) {
        this.holographicPortraitService = holographicPortraitService;
        this.itfEntBaseInfoService = itfEntBaseInfoService;
    }

    @RequestMapping(value = "getItfEntBaseInfo", method = RequestMethod.POST)
     public
     @ResponseBody
    Map getItfEntBaseInfo(String str){
        return itfEntBaseInfoService.getItfEntBaseInfo(str);
     }

    @RequestMapping(value = "getJYan", method = RequestMethod.POST)
    public
    @ResponseBody
     Map getJYan(){
        return  holographicPortraitService.getJYan();
    }

    @RequestMapping(value = "getJYi", method = RequestMethod.POST)
    public
    @ResponseBody
    Map getJYi(){
        return  holographicPortraitService.getJYi();
    }
}
