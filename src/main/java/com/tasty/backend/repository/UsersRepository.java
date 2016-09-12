package com.tasty.backend.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tasty.backend.model.Users;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends PagingAndSortingRepository<Users, Long> {

    List<Users> findByName(@Param("name") String name);   
    Users findById(long id);
    List<Users> findAll();
}
