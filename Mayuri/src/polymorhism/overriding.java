package polymorhism;

public class overriding extends MethodOverLoading{
	int a=100;
	public overriding(){
		super();
		System.out.println("inside the child class");
	}
	void add(int a,int b){
		System.out.println("Addition is: "+(a+b));
	}
	void showData(){
		super.add(10, 20);
		System.out.println(super.a);
	}
	public static void main(String[] args){
		overriding riding=new overriding();
		riding.showData();
	}
}

