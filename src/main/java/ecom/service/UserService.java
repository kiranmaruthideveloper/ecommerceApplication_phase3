package ecom.service;

import ecom.model.User;
import ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id){
        return userRepository.findById(id);
    }

    public void removeUserById(int id){
        userRepository.deleteById(id);
    }

    public Optional<User> getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
}
