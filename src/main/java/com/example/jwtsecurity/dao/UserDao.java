package com.example.jwtsecurity.dao;

import com.example.jwtsecurity.entity.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser,Integer> {
    DAOUser findByUsername(String username);
}
