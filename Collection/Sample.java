import java.util.ArrayList;
import java.util.Collections;

class Sample  {
	public static void main(String args[])
	{
			System.out.println("ArrayList Implementation.");
System.out.println("     Start");
			ArrayList<Integer> s=new ArrayList<Integer>();
			s.add(10);
			s.add(30);
			s.add(100);
			s.add(67);
			System.out.println(s); System.out.println();
        //get element
                  System.out.println(s.get(2));
                  
                  for(int i=0;i<s.size();i++){
                   System.out.print(s.get(i)+"   ");
					}
                   System.out.println();
          //SetElement
                  s.set(1,50);
                  System.out.println(s);

           //delete Element
                  s.remove(2);
                 System.out.println(s);

           //Size
                   System.out.println(s.size());

                    s.add(12);
                    s.add(22);
                    s.add(2,78);
                    System.out.println(s+"    "); 

           //sorting
                   Collections.sort(s);
                   System.out.println("After Sorting "+s);


			            	System.out.println("     stop");

	}
}