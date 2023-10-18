package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.cloudapi.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
