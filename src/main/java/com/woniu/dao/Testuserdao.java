package com.woniu.dao;

import com.woniu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface Testuserdao {
    @Insert("insert into user (account,password) values (#{account},#{password}")
    void insertuser(User user);
}
