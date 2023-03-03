import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

class Hashing
{
	public static void main(String args[])
       {
			System.out.println("Start");

			HashSet<Integer> set=new HashSet<>();
			set.add(10);
			set.add(30);
			set.add(100);
		
			System.out.println(set);

			Iterator it=Set.iterator();
			System.out.println(it.next());
			System.out.println(it.next());


			while(it.hasNext())
			{
					System.out.println(it.next());
					
			}
			
	
	}

}