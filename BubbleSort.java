package lab2;

import java.util.Scanner;

public class BubbleSort {
    public void bubble_sort(int a[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is : ");
        for (int m = 0; m < n; m++) {
            System.out.println(a[m] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the number of elements : ");
        int n = s.nextInt();
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        b.bubble_sort(a, n);
    }
}
