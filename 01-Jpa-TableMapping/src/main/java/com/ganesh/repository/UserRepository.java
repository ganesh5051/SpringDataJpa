package com.ganesh.repository;

//import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
