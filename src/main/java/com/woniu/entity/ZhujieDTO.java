package com.woniu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZhujieDTO {
    private int id;
    private String role;
   private int pid;
   private List<String> name;
   private String animal;

}
