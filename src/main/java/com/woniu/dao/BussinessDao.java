package com.woniu.dao;

import com.woniu.entity.Bussiness;
import com.woniu.entity.TotCount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BussinessDao {
    @Select("select count(*) from business")
    int findcount();
    @Select("select * from business LIMIT #{ye},3")
    List<Bussiness> findbussiness(int ye);
    @Delete("delete from business where id =#{id}")
    void del(int id);
    @Select("select * from business where id =#{id}")
    Bussiness bb(int id);
    @Select("select count(*) from business")
    TotCount findtot();
    @Select("select count(*) from business where role=#{role}")
    int findxiaocount(String role);
    @Select("select * from business where role=#{role} LIMIT #{ye},3")
    List<Bussiness> findxiaobussiness(int ye,String role);


}
