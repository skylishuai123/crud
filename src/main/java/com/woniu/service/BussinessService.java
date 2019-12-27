package com.woniu.service;

import com.woniu.entity.Bussiness;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BussinessService {
    @Select("select count(*) from business")
    int findcount();
    @Select("select * from business LIMIT #{ye},3")
    List<Bussiness> findbussiness(int ye);
}
