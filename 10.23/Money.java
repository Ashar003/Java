public class Money implements Comparable<Money> {
	
	private int dollars, cents;
	
	/**
	 * Constructor makes a call to {@link #Money(int, int)} 
	 * with (0,0) as parameters
	 */
	public Money() {
		this(0,0);
	}
	
	public Money(int dollars, int cents) {
        this.dollars = dollars + (cents/100);
        this.cents = cents%100;
		// TODO Fill this in
		// Hint: Use integer division by 100 to get dollars from cents
		// and use modulus to get cent values between 0 and 100 (mod by 100)
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LAB 14
		Money m1 = new Money(), m2= new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2);
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.equals(m2));
		
		// LAB 15
		m1 = new Money(4,87);
		m2 = new Money(5,243);
		
		m1.add(m2);
		
		System.out.println(m1.toString());
		
	}

	public void add(Money other) {
        int temp = 0;
		// TODO Fill this in
		// Hint: Add the cents first, check if you surpass 100 (check hint from 2-arg constructor),
        // then add dollars
        if (cents > 100) temp = cents / 100;
        cents = cents + other.cents;
        dollars = dollars + other.dollars + temp;
	}

	@Override
	public int compareTo(Money other) {
        int value = 2;
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test the dollars in both first
		 * 2) If dollar values are equal, test
		 * cents in both
		 * 3) If both dollars and cents are equal return 0
		 * 
		 * Hint: compareTo can be viewed as a subtraction operation
		 */
        if(dollars == other.dollars){
            if(cents == other.cents)
                value = 0;
        }
        else if( dollars > other.dollars){
            value = 1;
        }
        else if(dollars < other.dollars){
            value = -1;
        }

        return value;
	}
	
	@Override
	public boolean equals(Object other) {
        boolean value = false;
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test if other is null
		 * 2) Test if other is of type Money
		 * 3) If the above tests pass, then cast other into
		 * type Money
		 * 4) Compare dollar and cents in both. 
		 * If equal return true, otherwise return false
		 */
		if (this == other) return true;
		if(other!=null && this.getClass().equals(other.getClass())) {
            // Start from step 3
            Object cast = Money.class.cast(other);
            if (dollars == cast.dollars) {
                if (cents == cast.cents)
                    value = true;
            }
            else{
                value = false;
            }

        }
        return value;
	}
	
	@Override
	public String toString() {
		String c;
		if(cents<10) {
			c = "0" + cents;
		} else {
			c = "" + cents;
		}
		return "$ " + dollars + "." + c;
	}
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}