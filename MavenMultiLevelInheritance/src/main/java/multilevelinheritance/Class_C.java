package multilevelinheritance;

public class Class_C extends Class_B {
	
	public void divide() {
		int c=a/b;
		System.out.println("The quotient is "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_C  c1=new Class_C();
		c1.add();
		c1.sub();
		c1.divide();
		System.out.println("The value of a is "+c1.a);
		System.out.println("The value of b is "+c1.b);
		

	}

}
