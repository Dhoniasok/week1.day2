package week1.day2;

public class ChangeOddindextoUppercase {

	public static void main(String[] args) {
		String name = "virat kohli";
		int length = 0;
		char[] toChar = name.toCharArray();
		System.out.println(" The result  is: ");
		for(int i = 0; i< toChar.length; i++)
		{
			length = i+1;
			if(length%2==0)
			{
				System.out.println(toChar[i]);
			}
			else
			{
				System.out.println(Character.toUpperCase(toChar[i]));
			}
		}
	}

}
