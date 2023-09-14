package pojo;

import org.base.BaseClass;

public class AmazonLogin extends BaseClass {
	public static void main(String[] args) {
		
	
	AmazonSignInPojo a=new AmazonSignInPojo();
	clickBtn(a.getAccounts());
	passText("6380403607",a.getEmailorMobileNo());
	clickBtn(a.getClickEmailContinueBtn());
	passText("6380403607",a.getPassword());
	clickBtn(a.getClickSignIn());

}
}