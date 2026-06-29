package com.example.ImagineBanking.bootstrap;

import com.example.ImagineBanking.domain.Users;
import com.example.ImagineBanking.repository.TransactionsRepository;
import com.example.ImagineBanking.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UsersRepository usersRepository;
    private final TransactionsRepository transactionsRepository;

    public BootStrapData(UsersRepository usersRepository, TransactionsRepository transactionsRepository) {
        this.usersRepository = usersRepository;
        this.transactionsRepository = transactionsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (usersRepository.count() == 0) {

            Users user = new Users();
            user.setFirstName("admin");
            user.setUsername("admin");
            user.setPassword("password");

            usersRepository.save(user);
        }
    }
}
