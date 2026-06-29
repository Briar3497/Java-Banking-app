package com.example.ImagineBanking.repository;

import com.example.ImagineBanking.domain.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users,Long> {
    @Query("SELECT p FROM Users p WHERE p.firstName LIKE %?1%")
    public List<Users> search(String keyword);
}
