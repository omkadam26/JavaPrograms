import java.util.Arrays;

public class ArraysEQL {
    public static void main(String[] args) {
        int arr[]={10,20,30,89,10};
        int arr1[]={30,40,20,20,10};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    System.out.println(arr[i]);
                }
                else{
                    System.out.println(arr[i]);
                }
            }
        }
        
        
        // if(Arrays.equals(arr,arr1))
        // {
        //     System.out.println("arrays are equal");
    
        // }
        // else{
        //     System.out.println("arrays are not equal");
        // }
    }
    
}
