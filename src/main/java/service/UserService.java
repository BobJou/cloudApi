	package service;

import org.springframework.stereotype.Service;

import me.dio.cloudapi.model.User;

@Service
public interface UserService {
	
	User findById(Long id);
	User create(User user);

}
