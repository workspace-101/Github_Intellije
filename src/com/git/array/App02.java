package com.git.array;

import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        int arr[]=creating_Arr();
        sort_zero_and_one(arr);
    }

    private static void sort_zero_and_one(int arr[]) {  // arr[]={1,0,1,0,1,0,1,0}
        int cnt=0;

        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==0){
                cnt++;
            }
        }
        for(int i=0;i<len;i++){
           if(i<cnt){
                arr[i]=0;
           }
           else{
               arr[i]=1;
           }
        }

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] creating_Arr() {
        Scanner cs=new  Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=cs.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=cs.nextInt();
        }
        return arr;
    }
}
