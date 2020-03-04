package com.company;

public class Main {

     public static int SequentialSearch(int[] A, int K) {
        int i = 0;
        while (i < A.length && A[i] != K) {
            i += 1;
        }
        if (i < A.length) return i;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(SequentialSearch(new int[]{1,2,3,4,5}, 3));
    }
}
