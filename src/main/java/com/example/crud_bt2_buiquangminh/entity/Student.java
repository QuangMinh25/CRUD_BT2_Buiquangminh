package com.example.crud_bt2_buiquangminh.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please add first name!")
    @Length(max = 10, min= 1, message = "less than ten and greater than one")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Email(message = "Please input a email!")
    private String email;

}
