

public class VisaCredit extends CreditCardTemplate {

	public VisaCredit(String name, String expiration, String number, String securityCode, double balance) {
		super(name, expiration, number, securityCode, balance);
	}

	@Override
	public boolean isSecCodeValid() {
		if (getSecurityCode().length() == 3) 
			return true;
		else 
			return false;
	}

	@Override
	public boolean cardNumLengthCheck() {
		if (getNumber().length() == 13 || getNumber().length() == 16 || getNumber().length() == 19)
			return true;
		else 
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		if (getNumber().substring(0, 1).equals("4"))
			return true;
		else 
			return false;
	}
	
	
}
