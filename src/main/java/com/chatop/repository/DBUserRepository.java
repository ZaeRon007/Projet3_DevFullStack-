package com.chatop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.chatop.model.DBUser;



@Repository
public interface DBUserRepository extends CrudRepository<DBUser, Integer>{
    DBUser findByEmail(String email);
    DBUser findByName(String name);
    DBUser findById(int id);
    boolean existsByEmail(String email);
}
