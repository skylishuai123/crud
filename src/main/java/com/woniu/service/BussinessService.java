package com.woniu.service;

import com.woniu.entity.Bussiness;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BussinessService {

    int findcount();

    List<Bussiness> findbussiness(int ye);
    void del(int id);
    Bussiness bb(int id);
}
