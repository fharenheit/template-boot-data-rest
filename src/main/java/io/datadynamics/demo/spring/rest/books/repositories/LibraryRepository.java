package io.datadynamics.demo.spring.rest.books.repositories;

import org.springframework.data.repository.CrudRepository;

import io.datadynamics.demo.spring.rest.books.models.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

}
