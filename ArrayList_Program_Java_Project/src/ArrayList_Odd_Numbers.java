import java.util.*;


public class ArrayList_Odd_Numbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int element=Integer.MAX_VALUE;
		//Simple arraylist
		ArrayList<Integer> list = new ArrayList<>();
		
		//Arraylist for odd list numbers
		ArrayList<Integer> oddList = new ArrayList<>();	
		
		//Printing message to the user
		System.out.println("Enter elements of the ArrayList");
		System.out.println("Remember when you'll press 0 \nYou will not allowed to add elements");
		
		while(element!=0)
		{
			element = in.nextInt();
			list.add(element);
		
		}
		
		//Finding off numbers from list and putting them in oddList
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2!=0)
			{
				oddList.add(list.get(i));
			}
		}
		
		//Printing odd Numbers using lambda expression and for each method
		if(oddList.isEmpty())
			System.out.println("No element is odd in the entered list");
		else
			oddList.forEach(a->System.out.println(a));
	}

}
