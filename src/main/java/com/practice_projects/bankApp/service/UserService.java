package com.practice_projects.bankApp.service;

import com.practice_projects.bankApp.dto.UserLoginDTO;
import com.practice_projects.bankApp.dto.UserRegistrationDTO;
import com.practice_projects.bankApp.entity.UserEntity;
import com.practice_projects.bankApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserRegistrationDTO newUser){
        UserEntity user = new UserEntity();
        Random random = new Random();

        user.setFullName(newUser.getFullName());
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        user.setDateOfBirth(newUser.getDateOfBirth());
        user.setGender(newUser.getGender());
        user.setPhoneNo(newUser.getPhoneNo());
        user.setAddress(newUser.getAddress());
        user.setNationalId(newUser.getNationalId());
        user.setAccountType(newUser.getAccountType());
        user.setCurrencyType(newUser.getCurrencyType());
        user.setAccountNo("PAK 300211" + random.nextInt(100000000,1000000000));
        user.setBalance(BigDecimal.valueOf(0));

        userRepository.save(user);
        return "Account No : " + user.getAccountNo();
    }

    public String loginUser(UserLoginDTO user){
        return "Test";
    }
}