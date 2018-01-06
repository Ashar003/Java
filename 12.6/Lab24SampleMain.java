
public class Lab24SampleMain {
	public static void main(String[] args) {
		Money[] money = { new Bill(100), new Bill(1), new Quarter(),
				new Quarter(), new Dime(), new Dime(),
				new Nickel(), new Penny() };
		MoneyList ml = new MoneyList();

		for (int i = 0; i < money.length; ++i)
			ml.append(money[i]);

		System.out.print("Forward Print: ");
		ml.recursivePrint();

		System.out.print("Reverse Print: ");
		ml.revPrint();

		System.out.println("Sum: $" + ml.recursiveSum());
		System.out.println("Sum of all Quarters: $" + ml.sumQuarters());
	}
}
