

import java.io.*;
import java.util.*;

public class Desecendascendorder {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		String s=br.readLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i=i+2)
		{
			even.add(Integer.valueOf(arr[i]));
			if(i+1!=arr.length)
			{
				odd.add(Integer.valueOf(arr[i+1]));
			}
		}
		Collections.sort(even,Collections.reverseOrder());
		Collections.sort(odd);
		for(int i=0;i<odd.size();i++)
			{
				System.out.print(even.get(i)+" "+odd.get(i)+" ");
			}
		if(odd.size() != even.size())
		{
			System.out.println(even.get(even.size()-1));
		}
		
		
		System.out.println(even+" "+odd);
}
}
