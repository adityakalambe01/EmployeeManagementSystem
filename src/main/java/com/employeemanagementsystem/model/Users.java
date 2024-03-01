package com.employeemanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long userID;

    @Column(name = "name")
    private String userFullName;

    @Column(name = "role")
    private String userRole;

    @Column(name = "email_id")
    private String userEmailId;

    @Column(name = "mobile_number")
    private Long userMobileNumber;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "date_of_birth")
    private LocalDate userDateOfBirth;

    @Column(name = "account_creation_date_time")
    private LocalDateTime userAccountCreationDateTime;

    @Column(name = "account_update_date_time")
    private LocalDateTime userAccountUpdateDateTime;

    @Column(name = "gender")
    private String userGender;

}
