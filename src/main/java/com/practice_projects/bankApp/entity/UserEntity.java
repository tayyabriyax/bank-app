package com.practice_projects.bankApp.entity;

import com.practice_projects.bankApp.enumeration.AccountTypeEnum;
import com.practice_projects.bankApp.enumeration.CurrencyEnum;
import com.practice_projects.bankApp.enumeration.GenderEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    private GenderEnum gender;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "address")
    private String address;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "account_type")
    private AccountTypeEnum accountType;

    @Column(name = "currency_type")
    private CurrencyEnum currency_type;

    @Column(name = "account_no")
    private String accountNo;
}