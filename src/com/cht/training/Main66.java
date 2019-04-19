package com.cht.training;

import java.util.Arrays;

public class Main66 {
    public static void main(String[] args) {
        Integer[] array1 = {3,1,4,1,5,9};
        String[] array2 = {"John","Ken","Mary","Tim","Mark"};
        System.out.println("array1:"+array1);
        System.out.println("array1:"+ Arrays.toString(array1));

        System.out.println("array1:"+array2);
        System.out.println("array1:"+ Arrays.toString(array2));

        Arrays.sort((array1));
        Arrays.sort((array2));

        System.out.println("after compare:"+Arrays.toString(array1));
        System.out.println("after compare:"+Arrays.toString(array2));

        System.out.println("find 1 position:"+Arrays.binarySearch(array1,1));
        System.out.println("find 4 position:"+Arrays.binarySearch(array1,4));
        System.out.println("find 84 position:"+Arrays.binarySearch(array1,84));
        System.out.println("find John position:"+Arrays.binarySearch(array2,"John"));
        System.out.println("find Johnny position:"+Arrays.binarySearch(array2,"Johnny"));
        Integer[] array3 = {3,1,4,1,5,9};
        System.out.println("find  1:"+Arrays.binarySearch(array3,1));
        System.out.println("find  1:"+Arrays.binarySearch(array3,4));
        System.out.println("find  1:"+Arrays.binarySearch(array3,94));
    }

}

