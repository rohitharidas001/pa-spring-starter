package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.Book;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Book, Long> {
}
