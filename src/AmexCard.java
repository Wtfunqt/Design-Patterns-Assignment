

public class AmexCard extends CreditCardTemplate {

	protected AmexCard(String name, String expiration, String number, String securityCode, double balance) {
		super(name, expiration, number, securityCode, balance);
	}

	@Override
	public boolean isSecCodeValid() {
		if (getSecurityCode().length() == 4) 
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumLengthCheck() {
		if (getNumber().length() == 15) 
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		int prefix = Integer.parseInt(getNumber().substring(0, 1));
		int prefix2 = Integer.parseInt(getNumber().substring(1, 2));
		if (prefix == 3 && (prefix2 == 4 || prefix2 == 7)) 
			return true;
		else
			return false;
	}

}
