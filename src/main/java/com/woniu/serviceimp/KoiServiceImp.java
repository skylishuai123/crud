package com.woniu.serviceimp;

import com.woniu.dao.KoiDao;
import com.woniu.entity.Koi;
import com.woniu.service.KoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KoiServiceImp implements KoiService {
    @Autowired
    private KoiDao koiDao;
    @Override
    public void adda(Koi koi) {
        koiDao.adda(koi);
    }

    @Override
    public List<Koi> dd(Koi koi) {
        return koiDao.dd(koi);
    }

    @Override
    public void gai(Koi koi) {
        koiDao.gai(koi);
    }
}
