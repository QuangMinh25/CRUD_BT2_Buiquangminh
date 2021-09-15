package com.example.crud_bt2_buiquangminh.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "first_name")
    private String first_name;
@Column(name = "last_name")
    private String last_name;
@Column(name = "email")
    private String email;

}
