package com.internal.careeraccelerator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.internal.careeraccelerator.orm.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
