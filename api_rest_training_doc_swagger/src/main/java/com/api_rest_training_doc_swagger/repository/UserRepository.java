package com.api_rest_training_doc_swagger.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.api_rest_training_doc_swagger.model.User;

@Repository
public class UserRepository {
	public void save(User user) {
		if(user.getId()==null) 
			System.out.println("Save - recebendo usuario na camada repository");
		else
			System.out.println("Update - recebendo usuario na camada repository");
		
		System.out.println(user);
	}
	
	public void deleteById(Integer id) {		
			System.out.println("Delete/id - recebendo usuario na camada repository");		
			System.out.println(id);		
	}
	
	public List<User> findAll(){
		System.out.println("List - Listando todos os usuários");
		List<User> users = new ArrayList<>();
		users.add(new User("weslley", "password"));
		users.add(new User("laisa", "masterpassword"));
        return users;
	}
	
	public User findById(Integer id) {
		System.out.println(String.format("Find/id - Recebendo o id: %d", id));
		return new User("weslley", "password");
	}

	public User findByUserName(String username) {
		System.out.println(String.format("Find/username - Recebendo o id: %s", username));
		return new User("weslley", "password");
	}
	

}
