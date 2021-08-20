package com.example.factormoviesdemo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.factormoviesdemo.pojo.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
