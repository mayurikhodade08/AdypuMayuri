package polymorhism;

public class MethodOverLoading {
	int a=200;
	public MethodOverLoading(){
		
		System.out.println("inside the parrent class");
	}
	
	void add(int a,int b){
		System.out.println("Addition is overloading : "+(a+b));
	}
void add(int a,int b,int c){
	System.out.println("Addition is overloading : "+(a+b));
}
public static void main(String[] args){
	MethodOverLoading overloading=new MethodOverLoading();
	overloading.add(20, 20);
}
}