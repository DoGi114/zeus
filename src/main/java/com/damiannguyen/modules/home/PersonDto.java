package com.damiannguyen.modules.home;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PersonDto {
    private String name;
    private String surname;
    private int age;
}
