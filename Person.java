package pack1;

class Person {
	String name;
	int age;
	
	void view() {
		System.out.println("이름:" + this.name + "나이:" + this.age);
	}

}
class Info {
	String name;
	
	void view(String st) {
		System.out.println(st + this.name);
	}

}


public class Main {

	public static void main(String[] args) {
		Person p1, p2;
		
		p1 = new Person();
		p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 60;
		p2.name = "이건길";
		p2.age = 40;
		
		p1.view();
		p2.view();
		
		Info info = new Info();
		info.name = "강동원";
		
		info.view("이름:");

	}

}
