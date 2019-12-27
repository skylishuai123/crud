package com.woniu.dao;

import com.woniu.entity.Bussiness;
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
}
