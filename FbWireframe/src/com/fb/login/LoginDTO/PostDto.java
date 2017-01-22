package com.fb.login.LoginDTO;

import com.fb.DB.*;

public class PostDto {
	
	private String Title;
	private int Likes;
	private Comments[] Comments;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getLikes() {
		return Likes;
	}
	public void setLikes(int likes) {
		Likes = likes;
	}
	public Comments[] getComments() {
		return Comments;
	}
	public void setComments(Comments[] comments) {
		Comments = comments;
	}
	
	
	

}
