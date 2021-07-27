package activities;
import java.util.ArrayList;

public class Activity9 {
	

	public static void main(String[] args)
	{
		ArrayList<String> MyList = new ArrayList<String>();
		MyList.add("Akshatha");
		MyList.add("Gopinath");
		MyList.add("Savanth");
		MyList.add("Karwar");
		MyList.add("Bangalore");
		
		for(String a:MyList)
		{
			System.out.println(a);
			
		}
		System.out.println();
		if(MyList.contains("Karwar"))
			System.out.println("name exists");
		else 
			System.out.println("name does not exists");
		
		
		System.out.println("size of the arraylist is " + MyList.size());
		
		MyList.remove(3);
		
		System.out.println("size of the arraylist after removing an element is " + MyList.size());
		
		
	}

}
