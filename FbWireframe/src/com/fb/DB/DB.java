package com.fb.DB;



public class DB {
	
	private String userId;
	private String password;
	protected DB dbArray[];
	private Post[] UserPost;
	private Comments[] Comments;
	
	
	
	public Comments[] getComments() {
		return Comments;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}
	

	public Post[] getUserPost() {
		return UserPost;
	}


	public DB(){};
	public DB(String userId,String password,Post userposts[]){
		this.userId=userId;
		this.password=password;
		this.UserPost =userposts;
	}
	
	protected void createdb(){
		
		dbArray = new DB[]{
				new DB("amit","123",createPostsAmit()),
				new DB("ram","456",createPostsRam()),
				new DB("mike","789",createPostsMike()),
				//new DB("shyam","123"), 
				//new DB("tom","123")
				
		};
				
				
	}
	
	
	private Post[] createPostsAmit(){
		Post posts1[]=new Post[]{
			new Post("AmitPost0",0,createCommentsAmit0()),
			new Post("AmitPost1",1,createCommentsAmit1()),
		};
		return posts1;
	}
	
	
	private Comments[] createCommentsAmit0(){
		
		Comments comments0[]=new Comments[]{
			new Comments("AmitPost0Comment0",new String[] {"AmitPost0Comment0Reply0","AmitPost0Comment0Reply1"}),
			new Comments("AmitPost0Comment1",new String[] {"AmitPost0Comment1Reply0","AmitPost0Comment1Reply1"}),
		};
		return comments0;
	}
	
	private Comments[] createCommentsAmit1(){
		
		Comments comments0[]=new Comments[]{
			new Comments("AmitPost1Comment0",new String[] {"AmitPost1Comment0Reply0","AmitPost1Comment0Reply1"}),
			new Comments("AmitPost1Comment1",new String[] {"AmitPost1Comment1Reply0","AmitPost1Comment1Reply1"}),
		};
		return comments0;
	}
	
	
	private Post[] createPostsRam(){
		Post posts1[]=new Post[]{
			new Post("RamPost0",0,createCommentsRam0()),
			new Post("RamPost1",1,createCommentsRam1()),
		};
		return posts1;
	}
	
	
	private Comments[] createCommentsRam0(){
		
		Comments comments0[]=new Comments[]{
			new Comments("RamPost0Comment0",new String[] {"RamPost0Comment0Reply0","RamPost0Comment0Reply1"}),
			new Comments("RamPost0Comment1",new String[] {"RamPost0Comment1Reply0","RamPost0Comment1Reply1"}),
		};
		return comments0;
	}
	
	private Comments[] createCommentsRam1(){
		
		Comments comments0[]=new Comments[]{
			new Comments("RamPost1Comment0",new String[] {"RamPost1Comment0Reply0","RamPost1Comment0Reply1"}),
			new Comments("RamPost1Comment1",new String[] {"RamPost1Comment1Reply0","RamPost1Comment1Reply1"}),
		};
		return comments0;
	}
	
	private Post[] createPostsMike(){
		Post posts1[]=new Post[]{
			new Post("MikePost0",0,createCommentsMike0()),
			new Post("MikePost1",1,createCommentsMike1()),
		};
		return posts1;
	}
	
	
	private Comments[] createCommentsMike0(){
		
		Comments comments0[]=new Comments[]{
			new Comments("MikePost0Comment0",new String[] {"MikePost0Comment0Reply0","MikePost0Comment0Reply1"}),
			new Comments("MikePost0Comment1",new String[] {"MikePost0Comment1Reply0","MikePost0Comment1Reply1"}),
		};
		return comments0;
	}
	
	private Comments[] createCommentsMike1(){
		
		Comments comments0[]=new Comments[]{
			new Comments("MikePost1Comment0",new String[] {"MikePost1Comment0Reply0","MikePost1Comment0Reply1"}),
			new Comments("MikePost1Comment1",new String[] {"MikePost1Comment1Reply0","MikePost1Comment1Reply1"}),
		};
		return comments0;
	}
	
	
	
	

}
