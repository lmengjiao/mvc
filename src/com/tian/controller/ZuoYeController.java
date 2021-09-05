package com.tian.controller;

import com.tian.bean.AdminInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zuoye")
public class ZuoYeController {
    //5种收参方式5遍
    @RequestMapping("/yuansheng1")
    public String yuansheng1(AdminInfo adminInfo, HttpSession session, HttpServletRequest request){
        //1.session
        session.setAttribute("adminInfo",adminInfo);
        //2.request
        String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);
        //return "home";
        //3.转发1
        //return "forward:/WEB-INF/pages/home.jsp";
        //4.转发2
       // return "forward:/pages/home";
       // 5.重定向
         return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/modelAndView1")
    public ModelAndView modelAndView1(AdminInfo adminInfo){
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminName",adminInfo.getAdminName());
        mav.addObject("adminPwd",adminInfo.getAdminPwd());
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping("/model1")
    public String model1(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/modelMap1")
    public String modelMap1(AdminInfo adminInfo, ModelMap modelMap){
        modelMap.put("adminName",adminInfo.getAdminName());
        modelMap.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/map1")
    public String map1(AdminInfo adminInfo, Map<String,Object> map){
        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("yuansheng2")
    public String yuansheng2(AdminInfo adminInfo,HttpSession session,HttpServletRequest request){
        //1.session
        session.setAttribute("adminInfo",adminInfo);
        //2.request
        String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);
        //return "home";
        //3.转发1
       // return "forward:/WEB-INF/pages/home.jsp";
        //4.转发2
       // return "forward:/pages/home";
        //5.重定向
        return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/modelAndView2")
    public ModelAndView modelAndView2(AdminInfo adminInfo,ModelAndView modelAndView){
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminName",adminInfo.getAdminName());
        mav.addObject("adminPwd",adminInfo.getAdminPwd());
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping("model2")
    public String model2(AdminInfo adminInfo,Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/modelMap2")
    public String modelMap2(AdminInfo adminInfo,ModelMap modelMap){
        modelMap.put("adminName",adminInfo.getAdminName());
        modelMap.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/map2")
    public String map2(AdminInfo adminInfo,Map<String,Object> map){
        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/yuansheng3")
    public String yuansheng3(AdminInfo adminInfo,HttpSession session,HttpServletRequest request){
        session.setAttribute("adminInfo",adminInfo);
        String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);
        //return "home";
       // return "forward:/WEB-INF/pages/home.jsp";
       // return "forward:/pages/home";
        return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/modelAndView3")
    public ModelAndView modelAndView(AdminInfo adminInfo,ModelAndView modelAndView){
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminName",adminInfo.getAdminName());
        mav.addObject("adminPwd",adminInfo.getAdminPwd());
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping("/modelMap3")
    public String modelMap3(AdminInfo adminInfo,ModelMap modelMap){
        modelMap.put("adminName",adminInfo.getAdminName());
        modelMap.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/map3")
    public String map3(AdminInfo adminInfo,Map<String,Object> map){
        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/model3")
    public String model3(AdminInfo adminInfo,Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/yuansheng4")
    public String yuansheng4(AdminInfo adminInfo, HttpSession session, HttpServletRequest request){
        //1.session
        session.setAttribute("adminInfo",adminInfo);
        //2.request
        String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);
        //return "home";
        //3.转发1
        //return "forward:/WEB-INF/pages/home.jsp";
        //4.转发2
        // return "forward:/pages/home";
        // 5.重定向
        return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/modelAndView4")
    public ModelAndView modelAndView4(AdminInfo adminInfo){
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminName",adminInfo.getAdminName());
        mav.addObject("adminPwd",adminInfo.getAdminPwd());
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping("/model4")
    public String model4(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/modelMap4")
    public String modelMap4(AdminInfo adminInfo, ModelMap modelMap){
        modelMap.put("adminName",adminInfo.getAdminName());
        modelMap.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/map4")
    public String map4(AdminInfo adminInfo, Map<String,Object> map){
        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("yuansheng5")
    public String yuansheng5(AdminInfo adminInfo,HttpSession session,HttpServletRequest request){
        //1.session
        session.setAttribute("adminInfo",adminInfo);
        //2.request
        String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);
        //return "home";
        //3.转发1
        // return "forward:/WEB-INF/pages/home.jsp";
        //4.转发2
        // return "forward:/pages/home";
        //5.重定向
        return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/modelAndView5")
    public ModelAndView modelAndView5(AdminInfo adminInfo,ModelAndView modelAndView){
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminName",adminInfo.getAdminName());
        mav.addObject("adminPwd",adminInfo.getAdminPwd());
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping("model5")
    public String model5(AdminInfo adminInfo,Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/modelMap5")
    public String modelMap5(AdminInfo adminInfo,ModelMap modelMap){
        modelMap.put("adminName",adminInfo.getAdminName());
        modelMap.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/map5")
    public String map5(AdminInfo adminInfo,Map<String,Object> map){
        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());
        return "home";
    }

    @RequestMapping("/regByBean1")
    @ResponseBody
    public String regByBean(AdminInfo adminInfo){
        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","注册成功");
        return "codeMap";
    }

    @RequestMapping("/031ajax")
    @ResponseBody
    public String ajax031(@RequestParam("ids[]") List<Integer> ids){
        for (Integer id : ids) {
            System.out.println("id = " + id);
        }
        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","成功");
        codeMap.put("data",ids);
        return "codeMap";
    }

    @RequestMapping("/041ajax")
    @ResponseBody
    public String ajax041(@RequestBody AdminInfo adminInfo){
        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","成功");
        codeMap.put("data",adminInfo);
        return "codeMap";
    }
}
