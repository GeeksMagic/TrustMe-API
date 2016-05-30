package com.trustme.api.db.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trustme.api.db.Users;

public interface UsersRepository extends CrudRepository<Users, String> {

	public List<Users> findAll();

}
