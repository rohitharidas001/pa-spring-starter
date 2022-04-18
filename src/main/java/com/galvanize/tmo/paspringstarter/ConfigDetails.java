package com.galvanize.tmo.paspringstarter;

import org.apache.tomcat.jni.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class ConfigDetails {

    @Bean
    public LibraryRepository createLibrep(){
        return new LibraryRepository() {
            @Override
            public <S extends Book> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Book> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public Iterable<Book> findAll() {
                return null;
            }

            @Override
            public Iterable<Book> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Book entity) {

            }

            @Override
            public void deleteAll(Iterable<? extends Book> entities) {

            }

            @Override
            public void deleteAll() {

            }
        };
    }
}
