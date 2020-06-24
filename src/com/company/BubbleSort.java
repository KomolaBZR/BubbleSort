package com.company;

public class BubbleSort {


    public static void main(String[] args){
        int[] arr=new int[] {5,3,6,2,4,1,1,1}; //array
        print(arr);
        System.out.println("is Array Sort - " +isArraySort(arr));
        bubbleSort(arr);
        print(arr);
        System.out.println("is Array Sort - " +isArraySort(arr));

    }



    private static void bubbleSort(int[] arr) {
        //int count = 0;
        boolean swapFlag=true;
        int j=0;
        while(swapFlag==true && j<arr.length){
            swapFlag=false;
        for(int i=1; i<arr.length-j; i++){
            //count++;
            if(arr[i]<arr[i - 1]){
                int temp=arr[i];                        //swap(i, i-1)
                arr[i]=arr[i - 1];
                arr[i - 1]=temp;
                swapFlag=true;
            }
        }
        j++;
        print(arr);}
    }

    private static void print(int[] arr) {
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static boolean isArraySort(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }return true;
    }


}
