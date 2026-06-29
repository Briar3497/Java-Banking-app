package com.example.ImagineBanking.service;

import com.example.ImagineBanking.domain.Users;

import java.util.List;

public interface UsersService {
    public List<Users> findAll();
    public Users findById(int theId);
    public void save (Users theUser);
    public void deleteById(int theId);

    public List<Users> listAll(String keyword);
}
