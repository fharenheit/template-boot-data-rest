package io.datadynamics.demo.spring.rest.books.repositories;

import org.springframework.data.repository.CrudRepository;

import io.datadynamics.demo.spring.rest.books.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
