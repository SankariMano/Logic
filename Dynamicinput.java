import java.io.*;
import java.util.*;
public class Dynamicinput {
	public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> list=new ArrayList<String>();
	String x;
	while(true)
		{
			x=br.readLine();
			if(!x.equals(""))
				list.add(x);
			else
				break;
	
		}


System.out.println(list);
}
}
