package com.woniu.dao;

import com.woniu.entity.Koi;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface KoiDao {
    @Insert("insert into koi (name,birth,stop)values(#{name},#{birth},#{stop})")
    void adda(Koi koi);
    @Select({"<script>",
    "select * from koi " ,
            "where 1=1",
            "<if test='name!=null'> and name=#{name}</if>",
            "<if test='id!=null'> and id=#{id}</if>",
            "</script>"
    })
    List<Koi> dd(Koi koi);
    @Update({"<script>",
    "update koi set",
            "<if test='name!=null'> name=#{name}</if>",
            "<if test='password!=null'> ,password=#{password}</if>",
            "where id=#{id}",
            "</script>"


    })
    void gai(Koi koi);
}
