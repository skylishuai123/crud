package com.woniu.controller;

import com.woniu.dao.BussinessDao;
import com.woniu.entity.Bussiness;
import com.woniu.entity.BussinessDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class ShowController {
    @Autowired
    private BussinessDao bussinessDao;
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
}
