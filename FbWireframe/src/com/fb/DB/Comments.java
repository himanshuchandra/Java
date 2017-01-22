package com.fb.DB;

public class Comments {
	private String Comment;
	private String Reply[];
	
	public Comments(String Comment,String Reply[]){
		this.Comment=Comment;
		this.Reply=Reply;
	}
	
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String[] getReply() {
		return Reply;
	}
	public void setReply(String[] reply) {
		Reply = reply;
	}
	
	

}
