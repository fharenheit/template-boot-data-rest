package io.datadynamics.demo.spring.rest.books.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.datadynamics.demo.spring.rest.books.models.Book;
import io.datadynamics.demo.spring.rest.books.projections.CustomBook;

@RepositoryRestResource(excerptProjection = CustomBook.class)
public interface BookRepository extends CrudRepository<Book, Long> {
}
