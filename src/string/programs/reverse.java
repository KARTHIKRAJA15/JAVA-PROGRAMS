package string.programs;

public class reverse {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String reverse="";
		for (int i = s.length()-1; i >= 0 ; i--) {
			reverse=reverse+s.charAt(i);
					}
		System.out.println(reverse);

	}

}
