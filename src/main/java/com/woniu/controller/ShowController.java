package com.woniu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.dao.BussinessDao;
import com.woniu.dao.ZhujieDao;
import com.woniu.entity.Bussiness;
import com.woniu.entity.BussinessDTO;
import com.woniu.entity.TotCount;
import com.woniu.entity.ZhujieDTO;
import com.woniu.service.BussinessService;
import com.woniu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class ShowController {
    @Autowired
    private BussinessService bussinessDao;
    @Autowired
    private ZhujieDao zhujieDao;
    private Map<String,Object> m= new HashMap<>();

    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/show")
    public String show(){
        return "admin-list";
    }
    @ResponseBody
    @RequestMapping("/find")
    public BussinessDTO all(int yema){
        int ye =(yema-1)*3;
        List<Bussiness> l=bussinessDao.findbussiness(ye);
        int totcount =bussinessDao.findcount();
        int totpage= (totcount%3==0)?(totcount/3): (int) (Math.ceil(totcount/3));
        BussinessDTO bussinessDTO = new BussinessDTO(l,totpage,yema,totcount);
        return bussinessDTO;
    }
    @ResponseBody
    @RequestMapping("/aa")
    public Bussiness aa(){
        System.out.println(123);
       return new Bussiness(1,"dsdssd",null,null,null,null,null,null,1);
    }
    @ResponseBody
    @RequestMapping("/del")
    public String del(int id) throws JsonProcessingException {
        String result="删除成功";
        bussinessDao.del(id);
        result=(new ObjectMapper().writeValueAsString(result));
        return result;
    }
    @ResponseBody
    @RequestMapping("/s")
    public String b(){
       String ss = String.valueOf(bussinessDao.findcount());
        return ss;
    }

    @RequestMapping("/sss")
    public String c(int id, HttpSession session){
       session.setAttribute("ll",bussinessDao.bb(id));
        return "member-add";
    }
    @ResponseBody
    @RequestMapping("/ss")
    public Bussiness d (HttpSession session){
       Bussiness bussiness= (Bussiness) session.getAttribute("ll");
        System.out.println(bussiness.getId());
       return bussiness;
    }
    @ResponseBody
    @RequestMapping("/xiaocha")
    public BussinessDTO xiaoall(int yema,String role){
        int ye =(yema-1)*3;

        List<Bussiness> l=bussinessDao.findxiaobussiness(ye,role);
        System.out.println(l);
        int totcount = bussinessDao.findxiaocount(role);
        int totpage= (totcount%3==0)?(totcount/3): (int) (Math.ceil(totcount/3));
        BussinessDTO bussinessDTO = new BussinessDTO(l,totpage,yema,totcount);

        return bussinessDTO;
    }
    @ResponseBody
    @RequestMapping("/hj")
    public ZhujieDTO fi(){
        return zhujieDao.findZhujieDto(33);
    }
    @ResponseBody
    @RequestMapping("/delall")
    public String dd(int[] delid){
        int a=0;
        for (int i=0;i<delid.length;i++){
             a=delid[i];
             bussinessDao.del(a);
        }
        return "成功";
    }
}
