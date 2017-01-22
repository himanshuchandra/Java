package com.fb.login.LoginHelper;

import com.fb.login.Dao.LoginDao;
import com.fb.login.LoginDTO.LoginDTO;
import com.fb.login.LoginDTO.MessageDTO;
import com.fb.login.LoginDTO.ObjectsDto;


public class LoginHelper extends LoginDao{
	
	private boolean dataValidate(LoginDTO loginDTO){
		
		boolean isValid=false;
		if(loginDTO.getUserId().length()>0 && loginDTO.getPassword().length()>0)
		{
			isValid=true;
		}
		
		return isValid;
		
	}
	
	public ObjectsDto checkUser(LoginDTO loginDTO){
		
		MessageDTO messageDTO= new MessageDTO();
		ObjectsDto objectsdto=new ObjectsDto();
		if(dataValidate(loginDTO)){		
			
			
			objectsdto=super.checkDb(loginDTO);

			return objectsdto;
			
		}
		else{
		
			
			messageDTO.setMessage("You cannot leave username or password empty");
			messageDTO.setStatus(false);
			objectsdto.setMessagedto(messageDTO);
			return objectsdto;
		}
		
	}

}
