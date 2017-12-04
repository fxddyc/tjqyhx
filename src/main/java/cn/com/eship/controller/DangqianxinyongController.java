package cn.com.eship.controller;

import cn.com.eship.service.DangqianxinyongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/dangqianxinyong")
public class DangqianxinyongController {

    private final DangqianxinyongService  dangqianxinyongService;

    @Autowired
    public DangqianxinyongController(DangqianxinyongService dangqianxinyongService) {
        this.dangqianxinyongService = dangqianxinyongService;
    }

    @RequestMapping("/qiyekanbanPage")
    public String openQiyekanbanPage(){
        return "qiyekanban";
    }

    @RequestMapping(value = "getDangqianxinyong", method = RequestMethod.POST)
    public
    @ResponseBody
    Map getDangqianxinyong(){
        return dangqianxinyongService.getDangqianxinyong();
    }

    @RequestMapping(value = "getZaianqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer getZaianqiye(){
        return dangqianxinyongService.getZaianqiye();
    }

    @RequestMapping(value = "getBaojianqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer getBaojianqiye(){
        return dangqianxinyongService.getBaojianqiye();
    }

    @RequestMapping(value = "getJinkoushouhuoqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer getJinkoushouhuoqiye(){
        return dangqianxinyongService.getJinkoushouhuoqiye();
    }

    @RequestMapping(value = "getChukoufahuoqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer getChukoufahuoqiye(){
        return dangqianxinyongService.getChukoufahuoqiye();
    }

    @RequestMapping(value = "getChukoushengchanqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer getChukoushengchanqiye(){
        return dangqianxinyongService.getChukoushengchanqiye();
    }

    @RequestMapping(value = "selectBYBaojiandan", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer selectBYBaojiandan(){
        return dangqianxinyongService.selectBYBaojiandan();
    }

    @RequestMapping(value = "selectBYBaojianjine", method = RequestMethod.POST)
    public
    @ResponseBody
    Double selectBYBaojianjine(){
        return dangqianxinyongService.selectBYBaojianjine();
    }

    @RequestMapping(value = "selectBYBaojianqiye", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer selectBYBaojianqiye(){
        return dangqianxinyongService.selectBYBaojianqiye();
    }

    @RequestMapping(value = "selectBjjeBfb", method = RequestMethod.POST)
    public
    @ResponseBody
    Double selectBjjeBfb(){
        return dangqianxinyongService.selectBjjeBfb();
    }

    @RequestMapping(value = "selectBYbuhegepici", method = RequestMethod.POST)
    public
    @ResponseBody
    Integer selectBYbuhegepici(){
        return dangqianxinyongService.selectBYbuhegepici();
    }

    @RequestMapping(value = "selectBYbuhegejine", method = RequestMethod.POST)
    public
    @ResponseBody
    Double selectBYbuhegejine(){
        return dangqianxinyongService.selectBYbuhegejine();
    }
}
