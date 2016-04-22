

public class MasterCard extends CreditCardTemplate {

	protected MasterCard(String name, String expiration, String number, String securityCode, double balance) {
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
		if (getNumber().length() == 16)
			return true;
		else
			return false;
	}

	@Override
	public boolean cardNumPrefixCheck() {
		int prefix = Integer.parseInt(getNumber().substring(0, 1));
		int prefix2 = Integer.parseInt(getNumber().substring(1, 2));
		if (prefix == 5 && prefix2 > 0 && prefix2 < 6) 
			return true;
		else
			return false;
	}

}
