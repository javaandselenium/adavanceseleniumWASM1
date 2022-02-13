package bebugging;

public class Test2 {
	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public void sub() {
		int a=20;
		int b=10;
		System.out.println(20-10);
	}
	

	public static void main(String[] args) {
System.out.println("hello java");
Test2 t=new Test2();
t.add();
System.out.println("hello selenium");
t.sub();
System.out.println("hello python");
System.out.println("hello Api");


	}

}
