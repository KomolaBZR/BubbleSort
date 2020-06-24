package com.company;

public class BubbleSort2 {

//another version of solution

    public static void main(String[] args){
        String[] strArr=new String[] {"ёж","арка","папа","дом"};
        //print(strArr);
        //System.out.println("is Array Sort - " +isArraySort(strArr));
        bubbleSort(strArr);
        print(strArr);
        //System.out.println("is Array Sort - " +isArraySort(strArr));

    }

    public static int strByLengthComparator(String str1, String str2){
       // return str1.length()-str2.length();
        //return int(car1.getPrice()-car2.getPrice());
        return str1.compareTo(str2);
    }
    private static void bubbleSort(String[] arr) {
        //int count = 0;
        boolean swapFlag=true;
        int j=0;
        while(swapFlag==true && j<arr.length){
            swapFlag=false;
            for(int i=1; i<arr.length-j; i++){
                //count++;
                if (strByLengthComparator(arr[i],arr[i - 1])<0){
                    String temp=arr[i];                        //swap(i, i-1)
                    arr[i]=arr[i - 1];
                    arr[i - 1]=temp;
                    swapFlag=true;
                }
            }
            //j++;
            //print(arr);
            }
    }

    private static void print(String[] arr) {
        for(String i:arr){
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
