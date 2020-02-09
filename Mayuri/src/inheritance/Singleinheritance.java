package inheritance;

public class Singleinheritance extends Calculator {
	

	    int sub(int a,int b){
	        return (a-b);
	    }

	    public static void main(String[] args){
	        Singleinheritance inheritance=new Singleinheritance();
	        System.out.println("Addition : "+inheritance.add(20,10));
	        System.out.println("substraction is "+inheritance.sub(20,10));
	    }
	    

	}
