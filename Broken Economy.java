import java.io.*;
import java.util.*;

public class Main{
    public static int floor(int []arr, int d)
    {
        int left = 0, right = arr.length - 1;
     
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] >= d)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return arr[right];
    }
    
    public static int ceil(int []arr, int d)
    {
        int left = 0, right = arr.length - 1;
     
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= d)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return arr[left];
    }
    

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int d = scn.nextInt();
        System.out.println(ceil(arr,d));
        System.out.println(floor(arr,d)); 
    }
}
