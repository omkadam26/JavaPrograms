import java.util.Arrays;
import java.util.Scanner;

class SecondLargest
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("we are implementing the array operations");
        //array declaration
	Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
            
        }
        System.out.println("and for printing the array element.");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("we are implementing the array sorting method with readimate functions.");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //and for printing the last element of array we use
        System.out.println("the largest element of array is "+arr[arr.length-1]);
        System.out.println("and the Second largest element of array is "+arr[arr.length-2]);

        //and we are implementing other methods also
        final int arr1[]=new arr1[]{10,20,30,89,90,47};
        if(Arrays.equals(arr,arr1))
        {
            System.out.println("both array are equal");
        }
        else{
            System.out.println("they are not equal");
        }

        
    }
}