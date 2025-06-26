package com.git.array;
import java.util.Scanner;

    public class Triplate_sum {
        public static void main(String[] args) {
            int []arr=dynaminArr();
            Scanner cs=new Scanner(System.in);
            System.out.println("Enter a number");
            int k=cs.nextInt();
            int res= triplates(arr,k);{
                System.out.println(res);
            }
        }

        private static int  triplates(int[] arr,int l) {
            int count=0;
            int len=arr.length;
            if(len<2){
                return count;
            }
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    for(int k=j+1;k<len;k++){
                        if(arr[i]+arr[j]+arr[k]==l){
                            count++;
                        }
                    }
                }
            }
            return count;
        }

        private static int[] dynaminArr() {
            Scanner cs=new Scanner(System.in);
            System.out.println("Enter the size of array.....!");
            int size=cs.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the array number");
            for(int i=0;i<size;i++){
                arr[i]=cs.nextInt();
            }
            return arr;
        }

    }


