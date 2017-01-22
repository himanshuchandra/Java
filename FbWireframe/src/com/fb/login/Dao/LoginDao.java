package com.fb.login.Dao;

import com.fb.DB.DB;
import com.fb.DB.Post;
import com.fb.login.LoginDTO.LoginDTO;
import com.fb.login.LoginDTO.ObjectsDto;
import com.fb.login.LoginDTO.MessageDTO;
import com.fb.login.LoginDTO.PostDto;

public class LoginDao extends DB{
	
	protected ObjectsDto checkDb(LoginDTO loginDTO){
		
		ObjectsDto objectsdto = new ObjectsDto();
		MessageDTO messageDTO=new MessageDTO();
		PostDto postdto[]=new PostDto[]{};
		
		messageDTO.setMessage("Invalid Userid or password");
		messageDTO.setStatus(false);
		
		super.createdb();
		

		
		
		for(DB db :dbArray){
			if(db!=null){
			if(db.getUserId().equals(loginDTO.getUserId())
				&& db.getPassword().equals(loginDTO.getPassword())){
				
				postdto=FillPosts(db);
				messageDTO.setStatus(true);
				messageDTO.setMessage("WElcome "+loginDTO.getUserId());
				objectsdto.setPostdto(postdto);
				
				break;
			}
			}
			
		}
		objectsdto.setMessagedto(messageDTO);
	
		return objectsdto;
		
//		MessageDTO messageDTO=new MessageDTO();
//		messageDTO.setMessage(message);
//		messageDTO.setStatus(status);
//		return messageDTO;
	}
	
	private PostDto[] FillPosts(DB db){
		Post UserPost[]=db.getUserPost();
		PostDto postdto[]=new PostDto[3];
		//postdto[0].setMessage("SUCCESS");
		for(int i=0;i<UserPost.length;i++){
			
			postdto[i]=new PostDto();
			postdto[i].setTitle(UserPost[i].getTitle());
			postdto[i].setLikes(UserPost[i].getLikes());
			postdto[i].setComments(UserPost[i].getComments());
			
		}
		
		return postdto;

	}
}
