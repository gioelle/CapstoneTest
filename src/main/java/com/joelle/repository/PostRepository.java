package com.joelle.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.joelle.entity.Posting;

@Repository
public interface PostRepository extends JpaRepository<Posting, Long> {
	@Query("Select P from Posting P where P.instances > 0")
	public Posting getAllPosts();

}
