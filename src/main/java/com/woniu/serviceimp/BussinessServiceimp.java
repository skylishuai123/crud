package com.woniu.serviceimp;

import com.woniu.dao.BussinessDao;
import com.woniu.entity.Bussiness;
import com.woniu.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BussinessServiceimp implements BussinessService {
    @Autowired
    private BussinessDao bussinessDao;
    @Override
    public int findcount() {
        return bussinessDao.findcount();
    }

    @Override
    public List<Bussiness> findbussiness(int ye) {
        return bussinessDao.findbussiness(ye);
    }
}
