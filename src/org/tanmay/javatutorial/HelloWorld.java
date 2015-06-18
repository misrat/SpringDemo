package org.tanmay.javatutorial;

public class HelloWorld {
	private String message;
	
	public void setmessage(String message){
		this.message = message;
	}
	public void getmessage(){
		System.out.println("Message:  " + this.message);
	}
	
	@Override
	public String toString(){
		return this.message;
	}
	
	//lifecycle of bean -
	//init() void no argument initializer called by init-method = "init" in config.xml
	public void init(){
		System.out.println("Bean inside init");
	}
	//destroy():void no argument method called by destroy-method = "destroy" in config.xml
	public void destroy(){
		System.out.println("Bean inside destroy");
	}
	
	//preprocessinng and postprocessing before and after the bean is created
	
	
	
}
