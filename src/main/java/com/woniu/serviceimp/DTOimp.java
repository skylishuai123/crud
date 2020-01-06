package com.woniu.serviceimp;

import com.woniu.dao.ZhujieDao;
import com.woniu.entity.User;
import com.woniu.entity.ZhujieDTO;
import com.woniu.service.DTOserivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DTOimp implements DTOserivice {
    @Autowired
    private ZhujieDao zhujieDao;
    @Override
    public ZhujieDTO findZhujieDto(int pid) {
        return zhujieDao.findZhujieDto(pid);
    }

    @Override
    public List<String> findStr(int pid) {
        return zhujieDao.findStr(pid);
    }

    @Override
    public String ff(int pid) {
        return zhujieDao.ff(pid);
    }
}
