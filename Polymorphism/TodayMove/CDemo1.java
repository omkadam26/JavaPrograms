
import java.util.ArrayList;
import java.util.Scanner;


public class CDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Float> list1=new ArrayList<Float>();
		ArrayList<Boolean> list2=new ArrayList<Boolean>();
		
		Scanner s=new Scanner(System.in);
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		
		
		
	}

}
