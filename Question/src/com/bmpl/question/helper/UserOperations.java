package com.bmpl.question.helper;

import com.bmpl.question.dto.UserDTO;

public class UserOperations {
	
	public boolean isAuthenticateUser(UserDTO userDTO){
		if(userDTO.getUserid().equals(userDTO.getPassword())){
			return true;
		}
		else
		{
			return false;
		}
	}

}
