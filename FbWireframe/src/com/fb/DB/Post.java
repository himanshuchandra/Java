package com.fb.DB;

public class Post {

	private String Title;
	private int Likes;
	private Comments[] Comments;
	
	public Post(String title,int likes,Comments[] comments){
		this.Title=title;
		this.Likes=likes;
		this.Comments=comments;
	}
	public String getTitle() {
		return Title;
	}
	public int getLikes() {
		return Likes;
	}
	public Comments[] getComments() {
		return Comments;
	}
	

	
}
