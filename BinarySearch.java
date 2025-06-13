//BinarySearch.java
// Input From Users


import java.util.*;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target elementl: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left+(right - left) / 2;
            
            if (arr[mid] == target) {
              System.out.println("Element found :" + mid);
              return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Elemnt Not found: ");
    }
}

// BinarySearch.java
// Input Already Uploaded

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 40, 50, 60, 70, 80, 90};
        int target = 50;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found!");
    }
}


