package com.university.rms_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "it3501")
    private int  it3501;
    @Column(name = "it3502")
    private int  it3502;
    @Column(name = "it3503")
    private int it3503;
    @Column(name = "it3504")
    private int it3504;
    @Column(name = "it3505")
    private int it3505;
    @Column(name = "it3506")
    private int it3506;

}
