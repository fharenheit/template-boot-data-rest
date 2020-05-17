package io.datadynamics.demo.spring.rest.books.repositories;

import org.springframework.data.repository.CrudRepository;

import io.datadynamics.demo.spring.rest.books.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
