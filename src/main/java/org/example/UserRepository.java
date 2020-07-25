package org.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByNome(String name);

    User findById(int id);

    User findCustomerById(Integer id);
}