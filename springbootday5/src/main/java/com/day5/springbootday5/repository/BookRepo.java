package com.day5.springbootday5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.day5.springbootday5.model.*;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
