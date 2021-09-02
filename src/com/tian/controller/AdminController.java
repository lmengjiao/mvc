package com.tian.controller;

import com.tian.bean.AdminInfo;
import com.tian.bean.Dog;
import com.tian.bean.Lover;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/admin")
public class AdminController {
    //注册成功后 如果是单体项目就要跳转到登陆页面 这个跳转是后台的转发或重定向
    //总之 是后台负责跳转 或携带数据的跳转
    //如果是前后台分离的项目 那么后台只负责返回给前端json的数据
    //跳转是前台来处理的 前端根据后台返回的code代码进行跳转
    //如果前端负责跳转 名字就做路由

    //什么叫做前后端分离 即项目上的分离和数据上的分离 他们的认证token/jwt + redis
    //项目上的分离：前端一个项目 后台一个项目
    //数据上的分离：还是一个数据 只不过前后端用json来交互数据 很少用jstl/el表达式来写项目 他们的认证是session

    //layui在ssm框架中的使用其实是数据上的分离 也可以作为项目上的分离
    //是json交互的 后台只需要返回给json数据就可以了
    @RequestMapping("/reg")
    @ResponseBody //返回给前端的json数据
   //layui版本
    public Map reg(String adminName,String adminPwd,String adminPwd1,String adminTime,String adminSex,String admin,String adminCity,String adminSwitch) {
        System.out.println("名字 = " + adminName);
        System.out.println("密码 = " + adminPwd);
        System.out.println("重复密码 = " + adminPwd1);
        System.out.println("时间 = " + adminTime);
        System.out.println("性别 = " + adminSex);
        System.out.println("爱好 = " + admin);
        System.out.println("城市 = " + adminCity);
        System.out.println("开关 = " + adminSwitch);
        Map codeMap = new HashMap();
        if (!adminPwd.equals(adminPwd1)) {
            codeMap.put("code", "4401");
            codeMap.put("msg", "你输入的密码不一致 注册失败！");
            return codeMap;
        }
        if (adminName.length()<=0){
            codeMap.put("code", "4402");
            codeMap.put("msg", "注册表单要写全哦！");
            return codeMap;
        }
        if (adminPwd.length()<=0){
            codeMap.put("code", "4402");
            codeMap.put("msg", "注册表单要写全哦！");
            return codeMap;
        }

        codeMap.put("code", 0);
        codeMap.put("msg", "注册成功！");
        return codeMap;
    }

    //传统版本 不返回json 使用跳转或重定向
    @RequestMapping("/regForm")
    public String regForm(String adminName,String adminPwd){
        System.out.println("adminName = " + adminName);
        System.out.println("adminPwd = " + adminPwd);
        return "loginFrom";
    }

    //springMvc的第二种收参方式（实体类）
    @RequestMapping("/regByBean")
    @ResponseBody
    public Map regByBean(AdminInfo adminInfo){
        System.out.println("adminInfo = " + adminInfo);
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "注册成功！");
        return codeMap;
    }
    
    //ajax接收数据
    @RequestMapping("/ajax03")
    @ResponseBody
    //前端ids[] 后台ids
    public Map ajax03(@RequestParam("ids[]") List<Integer> ids){ //当前端后端参数不一样时 需要使用注解@RequestParam
        for (Integer id : ids) {
            System.out.println("id = " + id);
        }
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "访问成功！");
        codeMap.put("data",ids); //返回到前端
        return codeMap;
    }

    //ajax接收数据
    @RequestMapping("/ajax04")
    @ResponseBody
    public Map ajax04(@RequestBody AdminInfo adminInfo){ //@RequestBody指的前端用json请求
        System.out.println("adminInfo = " + adminInfo);
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "访问成功！");
        codeMap.put("data",adminInfo); //返回到前端
        return codeMap;
    }

    //Ajax接收前端传来的多个对象
    @RequestMapping("/ajax05")
    @ResponseBody
    public Map ajax05(@ModelAttribute Lover lover, @ModelAttribute Dog dog){
        System.out.println("lover = " + lover);
        System.out.println("dog = " + dog);
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "访问成功！");
        codeMap.put("data1",lover); //返回到前端
        codeMap.put("data2",dog); //返回到前端
        return codeMap;
    }
    //如果前端传来多个对象 需要根据请求的前缀进行绑定
    @InitBinder("lover")
    public void binder01(WebDataBinder webDataBinder){ //WebDataBinder前端数据
        webDataBinder.setFieldDefaultPrefix("lover"); //前缀
    }
    //如果前端传来多个对象 需要根据请求的前缀进行绑定
    @InitBinder("dog")
    public void binder02(WebDataBinder webDataBinder){ //WebDataBinder前端数据
        webDataBinder.setFieldDefaultPrefix("dog"); //前缀
    }

    //json收多个对象
    @RequestMapping("/ajax06")
   // @GetMapping("/ajax06") //@RequestBody和@GetMapping不可以同时存在 拿不到参数
    @ResponseBody
    public Map ajax06(@RequestBody List<Lover> lover){//@RequestBody 是在方法体中拿取数据 所以不能用get请求
        for (Lover lover1 : lover) {
            System.out.println("lover = " + lover);
        }
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "访问成功！");
        codeMap.put("data",lover); //返回到前端
        return codeMap;
    }

    @RequestMapping("/ajax07")
    @ResponseBody
    public Map ajax07(@RequestBody Map map){ //常用 搞定一切
        System.out.println("map = " + map);
        System.out.println("map = " + map.get("adminName"));
        Map codeMap=new HashMap();
        codeMap.put("code", 0);
        codeMap.put("msg", "访问成功！");
        codeMap.put("data",map); //返回到前端
        return codeMap;
    }

    @RequestMapping("/ajax08")
    @ResponseBody
    public Map ajax08(Lover lover, @RequestParam(value="limit",required = false,defaultValue="5") Integer pageSize, Integer page){
        System.out.println("lover = " + lover);
        System.out.println("pageSize = " + pageSize);
        System.out.println("page = " + page);
        return null;
    }

    @RequestMapping("/zuoye")
    @ResponseBody
    public Map zuoye(){

    }
}
