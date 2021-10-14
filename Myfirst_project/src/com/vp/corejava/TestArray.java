package com.vp.corejava;

public class TestArray {
    public static void main(String[] args) {
        char myarray[] = new char[5];
        myarray[0] = 'A';
        myarray[1] = 'L';
        myarray[2] = 'P';
        myarray[3] = 'H';
        myarray[4] = 'A';
        System.out.println(myarray);
        System.out.println(myarray[3]);
        System.out.println(myarray.length);

        double myList[] = {1.1, 2.1, 3.5, 3.2, 4.4};
        double total=0;
        for (int i = 0; i < myList.length; i++) {
            //int result = myList.length;
            System.out.println(myList[i]+" ");
            total=total+myList[i];
        }
        System.out.println(total);
       printArray(new int[] {1,2,3,4,5});
        printArray (reverse(new int[] {1,2,3}));
    }
    //below we created a method where we using array as method argument in main method we are
    // using string type argument.and printArray method calling or initialising  array value in main method.
    public static void printArray(int[]array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    //here we rstrunning the value using array
    public static int[] reverse(int[]list){
        int[] result =new int[(list.length)];
        int len = result.length;
        for (int i=0,j=len-1 ;i<len; i++,j--){
            System.out.print(list[i]+" ");
            result[j] =list[i];
        }
        return result;
    }
}
