package com.example.ImagineBanking.service;

import com.example.ImagineBanking.domain.Users;
import com.example.ImagineBanking.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService{
    private final UsersRepository usersRepository;

    @Autowired

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Users> findAll() {
        return (List<Users>) usersRepository.findAll();
    }
    public List<Users> listAll(String keyword){
        if(keyword !=null){
            return usersRepository.search(keyword);
        }
        return (List<Users>) usersRepository.findAll();
    }
    @Override
    public Users findById(int theId) {
        Long theIdl=(long)theId;
        Optional<Users> result = usersRepository.findById(theIdl);

        Users theUser = null;

        if (result.isPresent()) {
            theUser = result.get();
        }
        else {
            // we didn't find the part id
            throw new RuntimeException("Did not find part id - " + theId);
        }

        return theUser;
    }

    @Override
    public void save(Users theUser) {
        usersRepository.save(theUser);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        usersRepository.deleteById(theIdl);
    }
}
