package com.DbJpa.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DbJpa.entity.User;
import com.DbJpa.repo.UserRepo;

@Service
public class UserService {
@Autowired
	private UserRepo userRepo;
public void saveData() throws Exception {
	String imagepath="C:\\Users\\nagalakshmi.a\\Pictures\\Screenshots\\Screenshot (3).png";
	User user=new User();
	user.setUserName("Suresh");
	user.setUserEmail("suresh24@gmail.com");
	byte[] arr=new byte[3048];
	FileInputStream fis=new FileInputStream(new File(imagepath));
	
	fis.read(arr);
	user.setUserImage(arr);
	userRepo.save(user);
}
}
