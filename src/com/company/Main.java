package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9,0};
        int[] y = gopMang(arr,arr1);
        for (int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
    }static int[] gopMang(int[] a, int[] b){
        int[] newArray = new int[a.length+b.length];
        for (int i =0;i<a.length;i++){
         newArray[i]=a[i];
        }
        for (int j=0;j<b.length;j++){
           newArray[j + a.length]=b[j];
        }
        return newArray;
    }
}
