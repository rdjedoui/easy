package com.mda.easy.dao;

import com.mda.easy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select distinct u from User u join fetch u.authorities")
    List<User> findAllWithAuthorities();

    User findByEmail(String email);
}
