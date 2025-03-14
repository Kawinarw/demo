package com.example.demo.service;

import com.example.demo.entity.UsersEntity;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<UsersEntity> findAll() {
        return usersRepository.findAll();
    }

    public UsersEntity findByUserId(int userId) {
        return null;
    }

    public UsersEntity save(UsersEntity usersEntity) {
        return usersRepository.save(usersEntity);
    }
}
