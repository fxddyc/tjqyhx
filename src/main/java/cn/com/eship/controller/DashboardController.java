package cn.com.eship.controller;

import cn.com.eship.models.Aajiqiyexinxi;
import cn.com.eship.models.ItfDclIoDecl;
import cn.com.eship.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    private final DashboardService dashboardService;

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping("/dashboardPage")
    public String openDashboardPage(){
        return "dashboard";
    }

    @RequestMapping(value = "getTestData1", method = RequestMethod.POST)
    public
    @ResponseBody
    ItfDclIoDecl getTestData(){
        return dashboardService.getTestData();
    }

    @RequestMapping(value = "getTestData2", method = RequestMethod.POST)
    public
    @ResponseBody
    Aajiqiyexinxi getTestData2(){
        return dashboardService.getTestData2();
    }

}
