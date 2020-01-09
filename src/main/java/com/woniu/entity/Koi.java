package com.woniu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Koi {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-hh" )
    private Date birth;
    @DateTimeFormat(pattern = "yyyy-MM-hh" )
    private Date stop;
    private String password;
}
