package edu.icet.rental.service;


import edu.icet.rental.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void delete(Long id);

    void update(User user);

    User searchById(Long id);

    List<User> getAll();
}
