

public class AmexCard extends CreditCardTemplate {

	protected AmexCard(String name, String expiration, String number, String securityCode) {
		super(name, expiration, number, securityCode);
	}

	@Override
	public boolean isSecCodeValid() {
		if (securityCode.length() == 4) 
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumLengthCheck() {
		if (number.length() == 15) 
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		int prefix = Integer.parseInt(number.substring(0, 1));
		int prefix2 = Integer.parseInt(number.substring(1, 2));
		if (prefix == 3 && (prefix2 == 4 || prefix2 == 7)) 
			return true;
		else
			return false;
	}

}
