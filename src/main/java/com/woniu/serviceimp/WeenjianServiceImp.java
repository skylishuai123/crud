package com.woniu.serviceimp;

import com.woniu.dao.WeenjianDao;
import com.woniu.entity.Wenjian;
import com.woniu.service.WeenjianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeenjianServiceImp implements WeenjianService {
    @Autowired
    private WeenjianDao weenjianDao;
    @Override
    public void addWenJian(Wenjian wenjian) {
        weenjianDao.addWenJian(wenjian);
    }
}
