package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = " I am a Dhoni fan ";
		String[] strArray = test.split(" ");
		int indexOfArray = 0;
		for (int i = 0; i < strArray.length; i++) 
		{
			indexOfArray=indexOfArray+1;
			if(indexOfArray%2==0) 
			{
				char[] toChar=strArray[i].toCharArray();
				int arraySize=toChar.length;
				for (int j = arraySize-1; j >=0; j--) 
				{ 
					System.out.print(toChar[j]);	
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(strArray[i]+" ");
			}
		}
	}

	}


