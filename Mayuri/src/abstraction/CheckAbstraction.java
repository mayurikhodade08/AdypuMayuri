package abstraction;

public class CheckAbstraction extends AbstractDemo implements interfacedemo {
@Override
void ShowData(){
	System.out.println("inside checkabstraction");
}
	public static void main(String[] args){
		
		 CheckAbstraction abstraction=new  CheckAbstraction();
		 abstraction.ShowData();
		 abstraction.getData();
	}
	@Override
	public void add(){
		}
	}
