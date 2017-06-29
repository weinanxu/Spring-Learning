package cn.edu.xidian.test;

public class HelloWorld {

	private String message;

	public HelloWorld() {
		System.out.println("this is test lazy-init....");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Your message is " + message);
	}
	
}
