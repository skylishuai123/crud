package com.woniu.serviceimp;

import com.woniu.dao.BussinessDao;
import com.woniu.entity.Bussiness;
import com.woniu.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BussinessServiceimp implements BussinessService {
    @Autowired
    private BussinessDao bussinessDao;
    @Cacheable("findcount")
    @Override
    public int findcount() {
        return bussinessDao.findcount();
    }
    @Cacheable("findbussiness")
    @Override
    public List<Bussiness> findbussiness(int ye) {
        return bussinessDao.findbussiness(ye);
    }
    @CacheEvict(value={"findcount","findbussiness"},allEntries=true)
    @Override
    public void del(int id) {
        bussinessDao.del(id);
    }

    @Override
    public Bussiness bb(int id) {
        return bussinessDao.bb(id);
    }
}
