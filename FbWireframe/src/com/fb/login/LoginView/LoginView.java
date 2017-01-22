package com.fb.login.LoginView;

import java.util.Scanner;

import com.fb.login.LoginDTO.LoginDTO;
import com.fb.login.LoginDTO.ObjectsDto;
import com.fb.login.LoginHelper.LoginHelper;

public class LoginView {
	
		
	void doLogin(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Userid");
		String userId =	scanner.nextLine();
		System.out.println("Enter Password");
		String Password = scanner.nextLine();
		
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserId(userId);
		loginDTO.setPassword(Password);
		
		LoginHelper loginHelper=new LoginHelper();
		
		ObjectsDto objectsdto= new ObjectsDto();
	    objectsdto=loginHelper.checkUser(loginDTO);
	    
	    System.out.println(objectsdto.getMessagedto().getMessage());
	    
	    
	    
	    if(objectsdto.getMessagedto().isStatus()){
	    	
	    	
	    
	    	for(int i=0;i<objectsdto.getPostdto().length;i++)
	    	{
	    		if(objectsdto.getPostdto()[i]!=null){
	    		System.out.println(objectsdto.getPostdto()[i].getTitle());
	    		System.out.println("Likes "+objectsdto.getPostdto()[i].getLikes());
			
	    		for(int j=0;j<objectsdto.getPostdto()[i].getComments().length;j++){
	    			System.out.println(objectsdto.getPostdto()[i].getComments()[j].getComment());
				
						for(int k=0;k<objectsdto.getPostdto()[i].getComments()[j].getReply().length;k++){
							System.out.println(objectsdto.getPostdto()[i].getComments()[j].getReply()[k]);
						}
	    		}	
	    		}
			
	    	
	    	}
	    
	    }

		
		scanner.close();
	} 
	
	public static void main(String[] args){
		LoginView view = new LoginView();
		view.doLogin();
	}
	
}

