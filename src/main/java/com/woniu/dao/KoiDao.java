package com.woniu.dao;

import com.woniu.entity.Koi;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface KoiDao {
    @Insert("insert into koi (name,birth,stop)values(#{name},#{birth},#{stop})")
    void adda(Koi koi);
}
