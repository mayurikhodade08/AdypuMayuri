package innerclass;

public class MemberInnerClass {
private String password="abcd@123";
	class CheckMemberInnerClass{
		String showPassword(){
			return password;
		}
	
}
	public static void main(String[] main){
		MemberInnerClass member=new MemberInnerClass();
		MemberInnerClass.CheckMemberInnerClass CheckMemberInnerClass= member.new CheckMemberInnerClass();
		System.out.println(CheckMemberInnerClass.showPassword());
	}
	
	
}
