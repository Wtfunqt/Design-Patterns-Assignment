

public abstract class CreditCardTemplate {
	private String name;
	private String number;
	private String expiration;
	private String securityCode;
	private double balance;
	
	protected CreditCardTemplate(String name, String number, String expiration, String securityCode, double balance) {
		this.name = name;
		this.number = number;
		this.expiration = expiration;
		this.securityCode = securityCode;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getExpiration() {
		return expiration;
	}

	public String getSecurityCode() {
		return securityCode;
	}



	public boolean validation() {
		boolean validator = false;
		if (nameCheck(name) == true && numberCheck(number) == true && numberCheck(expiration) == true 
				&& numberCheck(securityCode) == true) {
			if (isExpValid(expiration) == true && isSecCodeValid() == true && cardNumLengthCheck() == true && cardNumPrefixCheck() == true)
				validator = true;
		}
		return validator;
	}
	
	public abstract boolean isSecCodeValid();
	public abstract boolean cardNumLengthCheck();
	public abstract boolean cardNumPrefixCheck();
	
	private boolean nameCheck(String name) {
		boolean check = false;
		for (char i : name.toCharArray()) {
			if (Character.isDigit(i)) {
				System.out.println("One or more values are incorrect, please enter correct values");
				break;
			} else 
				check = true;
		}
		return check;
	}
	
	private boolean numberCheck(String number) {
		boolean check = false;
		for (char i : number.toCharArray()) {
			if (!Character.isDigit(i)) {
				System.out.println("One or more values are incorrect, please enter correct values");
				break;
			}
			else check = true;
		}
		return check;
	}

	protected boolean isExpValid(String date) throws NullPointerException {
		boolean finalValue = false;
		int mm, yy;
		mm = Integer.parseInt(date.substring(0, 2));
		yy = Integer.parseInt(date.substring(2, 4));
		if (mm > 12 || mm < 0)
			System.out.println("Incorrect month, please enter correct month!");
		else {
			if (yy < 16 || yy > 21) 
				System.out.println("Expired or Incorrect date, please enter correct date!");
			else if (yy == 16) {
				if (mm < 4) 
					System.out.println("Date on your card is expired, please enter correct date!");
				else finalValue = true;
			}
			else if (yy == 21) {
				if (mm > 4)
					System.out.println("Incorrect date, please enter correct date!");
				else finalValue = true;
			}
			else if (yy > 16 && yy < 21)
				finalValue = true;
		}
		return finalValue;
	}
	
	public String toString() {
		String string = "";
		string += "Credit Card Information as follow:"
				+ "\nCard number - " + number 
				+ "\nOwner name - " + name
				+ "\nExpiration date - " + expiration;
		return string;
	}
	
	public boolean pay(double price) {
		if (price > balance) 
			return false;
		else {
			balance = balance - price;
			return true;
		}
	}
}
