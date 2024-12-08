package com.practice_projects.bankApp.repository;

import com.practice_projects.bankApp.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
