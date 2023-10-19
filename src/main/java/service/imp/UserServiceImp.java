package service.imp;

import java.util.NoSuchElementException;


import me.dio.cloudapi.model.User;
import repository.UserRepository;
import service.UserService;

public class UserServiceImp implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;

	}
	
	
	
	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if (	userRepository.existsById(user.getId())){
			throw new IllegalArgumentException("Already existis");
		}
		return userRepository.save(user);
	}
	
	
	
}
