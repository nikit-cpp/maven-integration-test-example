package main;

public class Parent {
	private Child child;
	public Parent(){
		child = new Child();
	}
	
	public String getString(){
		return child.getString();
	}
}
