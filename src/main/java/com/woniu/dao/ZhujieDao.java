package com.woniu.dao;

import com.woniu.entity.User;
import com.woniu.entity.ZhujieDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ZhujieDao {
    @Select("select * from ff where pid=#{pid}")
    @Results({
            @Result(id=true,column = "pid",property = "pid"),
            @Result(property = "name",column = "pid",many = @Many(select ="findStr" )),
            @Result(property ="role" ,column = "pid",one = @One(select = "ff"))
    })
    ZhujieDTO findZhujieDto(int pid);
    @Select("select name from images where pid=#{pid}")
    List<String> findStr(int pid);
    @Select("select role from user where id=#{pid}")
    String ff(int pid);
}
