package lab2;

import java.util.Scanner;

public class BinarySearch {
    public void binary_search(int a[],int beg,int end,int k){
        int mid=(beg+end)/2;
        while(beg<=end){
            if(a[mid]<k){
                beg=mid+1;
            }
            else if(a[mid]==k){
                System.out.println("Element found at index : "+mid);
                break;
            }
            else{
                end=mid-1;
            }
            if(beg>end){
                System.out.println("Element not found");
            }
            mid=(beg+end)/2;
        }
    }

    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the number of elements : ");
        int n=s.nextInt();
        System.out.println("Enter the array elements (ascending order only) : ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the key : ");
        int key=s.nextInt();
        b.binary_search(a,0,n,key);


    }
}

