package crazywu.demo.dao;

import org.springframework.stereotype.Repository;

import crazywu.demo.pojo.User;

@Repository
public class UserDao {
    // sava user
    public void save(User user) {
        System.out.println("save user: " + user);
    }

    // delete user
    public void delete(User user) {
        System.out.println("delete user: " + user);
    }

    // update user
    public void update(User user) {
        System.out.println("update user: " + user);
    }

    // select user from id
    public User selectById(int id) {
        User user = new User();
        user.setAge(id);
        user.setName("name" + id);
        System.out.println("select user: " + user);
        return user;
    }  
}
