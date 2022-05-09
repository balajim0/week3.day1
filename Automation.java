package week3.day1;

public class Automation implements Language, TestTool {
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.defaultMethod();
	}

	public void Selenium() {
		System.out.println("Learning Selenium from interface");
	}

	public void Java() {
		System.out.println("Learning Java from interface");
	}

	public void defaultMethod() {
		this.Java();
		this.Selenium();
		System.out.println("default Method");
	}

}
