package com.bmpl.question.views;

import java.util.Scanner;

import com.bmpl.question.dto.UserDTO;
import com.bmpl.question.helper.UserOperations;

public class UserInputOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		UserOperations userOperation = new UserOperations();
		if(userOperation.isAuthenticateUser(userDTO)){
			System.out.println("Welcome User "+userDTO.getUserid());
		}
		else
		{
			System.out.println("Invalid Userid or Password");
		}

	}

}
