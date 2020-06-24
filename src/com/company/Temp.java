package com.company;
import java.util.Arrays;
public class Temp {




       static int[] intArr = {9, 3, 2, 1,100,99,86,77,45,33,11,88,97,89,96,97,98,91};


        public static void main(String[] args){
            sort();
            System.out.println(Arrays.toString(intArr));
        }


        static int[] sort() {

            //4 5 2 3 1     sort()
            //4 2 5 3 1        sort()
            //2 4 5 3 1          sort()
            //2 4 3 5 1            sort()
            //2 3 4 5 1               sort()
            //2 3 4 1 5                 sort()
            //2 3 1 4 5                   sort()
            //2 1 3 4 5                     sort()
            //1 2 3 4 5                       sort()


            int k;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] <= intArr[i + 1]) {
                    continue;
                }
                k = intArr[i];
                intArr[i] = intArr[i + 1];
                intArr[i + 1] = k;
                sort();

            }
            return intArr;
        }

}
