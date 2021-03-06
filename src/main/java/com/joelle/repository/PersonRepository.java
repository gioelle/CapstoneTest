package com.joelle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.joelle.entity.User;

@Repository
public interface PersonRepository extends JpaRepository<User, String> {
	@Query("Select U from User U where U.email=:email and U.password=:password")
	public User login(@Param("email")String email, @Param("password")String password);
	
}

