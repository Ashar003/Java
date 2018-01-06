
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}
	
	private static boolean isPalindromeHelper(String in) {
		int length = in.length();
		int n = 0;
		if (!Character.isLetter(in.charAt(n))) 
			return 0;
		if (in.charAt(length) )
			return 1;
		if( n++ < length--){
			String sub = in.substring(n, length);
			System.out.println(sub);
			if(sub.Character.isLetter(charAt(n)).equals(sub.Character.isLetter(charAt(length))))
		return isPalindromeHelper(sub);
		}
		return false;
		
	}
}

