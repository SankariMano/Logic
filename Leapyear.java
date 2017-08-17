import java.util.*;

public class Leapyear {
	public static void main(String args[]) 
	{
	Scanner br=new Scanner(System.in);
	  Integer a=br.nextInt();
	  if(a%100!=0 && a%4==0 &&a%400==0)
	  		  System.out.println("yes");
	else
		  System.out.println("no");
}
}
