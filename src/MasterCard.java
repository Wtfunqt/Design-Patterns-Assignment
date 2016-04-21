

public class MasterCard extends CreditCardTemplate {

	protected MasterCard(String name, String expiration, String number, String securityCode) {
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
		if (number.length() == 16)
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		int prefix = Integer.parseInt(number.substring(0, 1));
		int prefix2 = Integer.parseInt(number.substring(1, 2));
		if (prefix == 5 && prefix2 > 0 && prefix2 < 6) 
			return true;
		else
			return false;
	}

}
