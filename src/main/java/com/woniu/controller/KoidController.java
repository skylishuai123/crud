package com.woniu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.dao.KoiDao;
import com.woniu.entity.Koi;
import com.woniu.service.KoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/h")
public class KoidController {
    @Autowired
    private KoiService koiService;
    @RequestMapping("/s")
    public String show(){
        return "7";
    }

    @RequestMapping("/ss")
    @ResponseBody
    public String ss(Koi koi) throws JsonProcessingException {
        String result="成功";
        koiService.adda(koi);
       result= (new ObjectMapper().writeValueAsString(result));
        return result;
    }
}
