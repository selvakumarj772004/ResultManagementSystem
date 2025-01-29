package com.university.rms_backend.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private long id;
    private String name;
    private int  it3501;
    private int  it3502;
    private int it3503;
    private int it3504;
    private int it3505;
    private int it3506;

}
