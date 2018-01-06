// MoneyList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this MoneyList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this MoneyList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(String d) { //adds to the end
		// TODO Code here for append
		MoneyNode n = new MoneyNode(d); //Create a new MoneyNode "n" using the parameter d.
		last.next = n; //the old last.next now points to the new list node "n", making 
		last = n; //last is set equal to the MoneyNode n, so it LAST NOW!
		length++; //length is incremented.
	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * MoneyList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(String d) { //adds to the beginning after the dummy first.
		// TODO Code here for prepend
		MoneyNode n = new MoneyNode(d); //Create a new MoneyNode "n" using the parameter d.
		n.next = first.next; //The next of the new "n" points to that of the first.next , so now it is second after the first.
		//first.next points to green car & n.next points to yellow car. 
		//After this statement n.next ponts to the green car.
		first.next = n; //first.next nows points to the value of MoneyNode n. 
		if(n.next == null) last = n; //if there is nothing after n then set that as last.
		length++;
	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		MoneyNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}

	/**
	 * Determines whether this ShortSequenceMoneyList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceMoneyList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceMoneyList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceMoneyList containing the same numbers at each index
	 *         as this ShortSequenceMoneyList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((MoneyList) other).length)
			return false;

		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals

	public void recursivePrint() {
		recursivePrint(first.next);
	}

	private void recursivePrint(MoneyNode mn) {
		if (mn == null) return;
		System.out.print(mn.data + "");
		recursivePrint(mn.next);
	}

	public void revPrint() {
		revPrint(last);
	}

	private void revPrint(MoneyNode mn){
		if ( mn == null) return;
		revPrint(mn.next);
		System.out.println(mn.data + " ");
	}
	public double recursiveSum(){
		recursiveSum(first.next);
	}

	private double recursiveSum(MoneyNode mn){
		if(nm == null) return 0;
		if(mn.data instanceof Coin)
			return (mn.data.getValue()/100) + recursiveSum(mn.next);
		return mn.data.getValue() + recursiveSum(mn.next);
	}

	public double sumQuarters(){
		return sumQuarters(first.next);
	}
	private double sumQuarters(MoneyNode mn) {
		if (mn == null) return 0;
		if (mn.data instanceof Quarter)
			return mn.data.getValue()/100.0 + recursiveSum(mn.next);
		return recursiveSum(mn.next);
	}


} // class MoneyList

