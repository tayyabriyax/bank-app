package com.practice_projects.bankApp.service;

import com.practice_projects.bankApp.dto.UserRegistrationDTO;
import com.practice_projects.bankApp.entity.UserEntity;
import com.practice_projects.bankApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserRegistrationDTO newUser){
        UserEntity user = new UserEntity();

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
        user.setAccountNo("PAK-98544589");

        userRepository.save(user);
        return "Account No : " + user.getAccountNo();
    }
}