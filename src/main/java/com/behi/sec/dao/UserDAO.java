package com.behi.sec.dao;

import com.behi.sec.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<UserEntity, Integer> {
    @Query("select u from USERS u where lower(trim(u.username)) = lower(trim(:username))")
    UserEntity findByUsername(@Param("username") String username);
    UserEntity findByMobile(String mobile);
}
