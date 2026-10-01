package com.spring.RustApi.dto;
import lombok.Data;
@Data
public class StudentDto {
     String id;
     String name;
     String email;
    public StudentDto(String d, String d1, String d2) {
        this.id = d;
        this.name = d1;
        this.email = d2;
    }
}