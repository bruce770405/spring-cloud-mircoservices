package com.bruce.mircoservice.clientservice.Repository;

import com.bruce.mircoservice.clientservice.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}
