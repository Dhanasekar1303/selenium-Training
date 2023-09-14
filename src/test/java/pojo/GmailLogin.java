package pojo;

public class GmailLogin extends GmailPojo {
	public static void main(String[] args) {
		GmailPojo g=new GmailPojo();
	
	passText("dhanasekar00638@gmail.com",g.getEmail());
	clickBtn(g.getEmailNextBtn());
	passText("12344",g.getPassword());
	clickBtn(g.getPasswordNextBtn());
	

}
}