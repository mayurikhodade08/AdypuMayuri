package practice;

public class Armstrong {
	void ShowData(){
		int n=153,a,c=0,r;
		r=n;
		while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(r==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");    
		}   
	public static void main(){
		Armstrong arm=new Armstrong();
		arm.ShowData();
	}
	}


