package com.woniu.service;

import com.woniu.entity.User;
import com.woniu.entity.ZhujieDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DTOserivice {
    ZhujieDTO findZhujieDto(int pid);
    List<String> findStr(int pid);
    String ff(int pid);
}
