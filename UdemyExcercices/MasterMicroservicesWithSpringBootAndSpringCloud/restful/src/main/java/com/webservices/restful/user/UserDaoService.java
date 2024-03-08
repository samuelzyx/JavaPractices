package com.webservices.restful.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    //JPA/Hibernate > Database
    //UserDaoService > Static List

    private static List<User> users = new ArrayList<>();

    private static int userCounter = 1;

    static{
        users.add(new User(userCounter++,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(userCounter++,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(userCounter++,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public User save(User user){
        user.setId(userCounter++);
        users.add(user);
        return user;
    }
}
