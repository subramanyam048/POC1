package org.Demo.repository;



import org.Demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository extends JpaRepository<User,Integer> {

	

}
