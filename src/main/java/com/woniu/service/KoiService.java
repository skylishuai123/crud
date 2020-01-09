package com.woniu.service;

import com.woniu.entity.Koi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KoiService {
    void adda(Koi koi);
    List<Koi> dd(Koi koi);
    void gai(Koi koi);
}
