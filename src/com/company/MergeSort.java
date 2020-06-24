package com.company;

public class MergeSort {

    public static int[] getArray(int size,int min, int max){
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }

 /*   {1,4,6,8,9}

      {4,5,7}

      new []{1,4,4,6,7,8,9}

     int[] merge(int[] arr1,int[] arr2)


     {6,7,8,1,4,6,8} 0, 3, 7  ->
     merge(int[] arr, from, middle, to)
      {1, 3, 0, 8}
     {1,3}    {0,8}
    {1}{3}    {0}{8}
     {1,3}    {0,8}
       {0,1,3,8}
*/


}
