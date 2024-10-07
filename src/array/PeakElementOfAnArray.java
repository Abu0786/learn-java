package array;

import java.util.Scanner;

public class PeakElementOfAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How number you want to enter");
        int i= sc.nextInt();
        int[] a= new int[i];
        System.out.println("Enter number you want to enter in  array");
        for (int j=0 ;j<a.length ;j++){
            a[j] = sc.nextInt();
        }
        System.out.println("Enter number you want to enter in  array");
        for (int j=0 ;j<a.length ;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println(" ");
        int peakElement = peakElement(a,i);
        if(peakElement==-1){
            System.out.printf("No Peak element found");
        }
        else {
            System.out.printf("peak element of this array::"+peakElement);
        }
    }


    static int peakElement(int arr[], int n)
    {
//        for(int i=0;i<arr.length;i++) {
//            if((i==0 || arr[i]>=arr[i-1]) && (i==arr.length-1 || arr[i]>=arr[i+1])){
//                return arr[i];
//            }
//        }
//        return -1;
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Compare mid with its right neighbor
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // Peak is on the right side
            } else {
                high = mid; // Peak is on the left side or at mid
            }
        }

        return arr[low];
    }

}
