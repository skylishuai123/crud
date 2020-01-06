package com.woniu.dao;

import com.woniu.entity.Wenjian;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface WeenjianDao {
    @Insert("insert into wenjian (name,password,images) values(#{name},#{password},#{images})")
    void addWenJian(Wenjian wenjian);

}
