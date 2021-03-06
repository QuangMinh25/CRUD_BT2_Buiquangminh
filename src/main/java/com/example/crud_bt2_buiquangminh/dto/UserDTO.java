package com.example.crud_bt2_buiquangminh.dto;
import com.example.crud_bt2_buiquangminh.entity.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserDTO {
    private String email;

    private String fullName;

    private String phone;

    private String avatar;

    public UserDTO(User original) {
        this.email = original.getEmail();
        this.fullName = original.getFullName();
        this.phone = original.getPhone();
        this.avatar = original.getAvatar();
    }

}
