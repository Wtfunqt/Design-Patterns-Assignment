

public class VisaCredit extends CreditCardTemplate {

	public VisaCredit(String name, String expiration, String number, String securityCode) {
		super(name, expiration, number, securityCode);
	}

	@Override
	public boolean isSecCodeValid() {
		if (securityCode.length() == 3) 
			return true;
		else 
			return false;
	}

	@Override
	public boolean cardNumLengthCheck() {
		if (number.length() == 13 || number.length() == 16 || number.length() == 19)
			return true;
		else 
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		if (number.substring(0, 1).equals("4"))
			return true;
		else 
			return false;
	}
	
	
}
