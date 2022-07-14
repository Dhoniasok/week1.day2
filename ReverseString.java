package week1.day2;

public class ReverseString {
	
public static void main(String[] args) {
	String str = "Dhoni" ;
	
	char[] chars = str.toCharArray(); 
	for(int i = 5-1; i >= 0; i--) {
	System.out.print(chars[i]);
}
}
}