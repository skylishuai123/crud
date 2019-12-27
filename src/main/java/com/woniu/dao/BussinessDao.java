package com.woniu.dao;

import com.woniu.entity.Bussiness;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BussinessDao {
    @Select("select count(*) from business")
    int findcount();
    @Select("select * from business LIMIT #{ye},3")
    List<Bussiness> findbussiness(int ye);
}
