package com.woniu.controller;

import com.woniu.entity.Wenjian;


import com.woniu.service.WeenjianService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/f")
public class FileController {
    @Autowired
    private WeenjianService weenjianService;
    @RequestMapping("/file")

    public String show(){
        return "2";
    }

    @PutMapping(value = "/ff")
    public String ss(Wenjian wenjian, MultipartFile myfile, HttpServletRequest request) throws IOException {
        String path= request.getServletContext().getRealPath("tupian");
        System.out.println(123);
        String name=myfile.getOriginalFilename();
        File f = new File(path+"/"+name);

        if(!f.exists()){
            FileUtils.copyInputStreamToFile(myfile.getInputStream(),f);
            wenjian.setImages("/tupian/"+name);
            weenjianService.addWenJian(wenjian);
        }
        System.out.println(f.getAbsolutePath());
        return "3";
    }
    @RequestMapping("/qw")
    public  String jj(){
        return "3";
    }
}
