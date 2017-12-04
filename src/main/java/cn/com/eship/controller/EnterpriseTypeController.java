package cn.com.eship.controller;

import cn.com.eship.service.EnterpriseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@RequestMapping("/enterpriseType")
public class EnterpriseTypeController {

    private final EnterpriseTypeService enterpriseTypeService;

    @Autowired
    public EnterpriseTypeController(EnterpriseTypeService enterpriseTypeService) {
        this.enterpriseTypeService = enterpriseTypeService;
    }

    @RequestMapping(value = "getEnterpriseType", method = RequestMethod.POST)
    public
    @ResponseBody
    Map getEnterpriseType(){
        return enterpriseTypeService.getEnterpriseType();
    }

    @RequestMapping(value = "getZb", method = RequestMethod.POST)
    public
    @ResponseBody
    Map getZb(){
        return enterpriseTypeService.selectQyzsl();
    }

    @RequestMapping(value = "selectDyfb", method = RequestMethod.POST)
    public
    @ResponseBody
    Map selectDyfb(){
        return enterpriseTypeService.selectDyfb();
    }

    @RequestMapping(value = "selectDyfbzb", method = RequestMethod.POST)
    public
    @ResponseBody
    Map selectDyfbzb(){
        return enterpriseTypeService.getDyfbzb();
    }
}
