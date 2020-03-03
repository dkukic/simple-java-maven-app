package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

	private final String message = "Hello World!";

	public App() {
	}

	public static void main(String[] args) {
		App app = new App();
		app.setMessage("Brave new world");

		System.out.println(app.getMessage());
	}

	private final String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

}
