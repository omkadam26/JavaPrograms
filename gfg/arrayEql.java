import java.util.Arrays;

public class arrayEql {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,6,7,1,0};
        int arr1[]=new int[]{90,78,70,5,43};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("after sorting array looks like.");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr1.length-1;i++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]+"Not Equal in array.");
                }
            }
    
        }
    }
    
}
