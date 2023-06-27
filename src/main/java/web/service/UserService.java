package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(long id);

    void save(User user);

    void update(long id, User updatedUser);

    void delete(long id);
}
