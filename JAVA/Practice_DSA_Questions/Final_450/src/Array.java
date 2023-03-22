import java.util.*;
import java.lang.*;
import java.io.*;


public class Array {

    public static void arr1() {
        //Reverse the array
        System.out.println("Solving question 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void arr2() {
        //Find the maximum element
        System.out.println("Solving question 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        int max=0;
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }

    public static void arr3() {
        //Find the "Kth" max and min element of an array
        System.out.println("Solving question 3");
    }
    public static void arr4() {
        //Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
        System.out.println("Solving question 4");
    }

    public static void arr5() {
        //Move all the negative elements to one side of the array
        System.out.println("Solving question 5");
    }

    public static void arr6() {
        //Find the Union and Intersection of the two sorted arrays.
        System.out.println("Solving question 6");
    }

    public static void arr7() {
        //Write a program to cyclically rotate an array by one.
        System.out.println("Solving question 7");
    }

    public static void arr8() {
        //find the Largest sum contiguous Sub-array [V. IMP]
        System.out.println("Solving question 8");
    }

    public static void arr9() {
        //Minimise the maximum difference between heights [V.IMP]
        System.out.println("Solving question 9");
    }

    public static void arr10() {
        //Minimum no. of Jumps to reach end of an array
        System.out.println("Solving question 10");
    }

    public static void arr11() {
        //find duplicate in an array of N+1 Integers
        System.out.println("Solving question 11");
    }

    public static void arr12() {
        //Merge 2 sorted arrays without using Extra space.
        System.out.println("Solving question 12");
    }

    public static void arr13() {
        //Kadane's Algo [V.V.V.V.V IMP]
        System.out.println("Solving question 13");
    }

    public static void arr14() {
        //Merge Intervals
        System.out.println("Solving question 14");
    }

    public static void arr15() {
        //Next Permutation
        System.out.println("Solving question 15");
    }

    public static void arr16() {
        //Count Inversion
        System.out.println("Solving question 16");
    }

    public static void arr17() {
        //Best time to buy and Sell stock
        System.out.println("Solving question 17");
    }

    public static void arr18() {
        //find all pairs on integer array whose sum is equal to given number
        System.out.println("Solving question 18");
    }

    public static void arr19() {
        //find common elements In 3 sorted arrays
        System.out.println("Solving question 19");
    }

    public static void arr20() {
        //Rearrange the array in alternating positive and negative items with O(1) extra space
        System.out.println("Solving question 20");
    }

    public static void arr21() {
        //Find if there is any sub-array with sum equal to 0
        System.out.println("Solving question 21");
    }

    public static void arr22() {
        //Find factorial of a large number
        System.out.println("Solving question 22");
    }

    public static void arr23() {
        //find maximum product sub-array
        System.out.println("Solving question 23");
    }

    public static void arr24() {
        //Find longest consecutive subsequence
        System.out.println("Solving question 24");
    }

    public static void arr25() {
        //Given an array of size n and a number k, fin all elements that appear more than " n/k " times.
        System.out.println("Solving question 25");
    }

    public static void arr26() {
        //Maximum profit by buying and selling a share at most twice
        System.out.println("Solving question 26");
    }

    public static void arr27() {
        //Find whether an array is a subset of another array
        System.out.println("Solving question 27");
    }

    public static void arr28() {
        //Find the triplet that sum to a given value
        System.out.println("Solving question 28");
    }

    public static void arr29() {
        //Trapping Rain water problem
        System.out.println("Solving question 29");
    }

    public static void arr30() {
        //Chocolate Distribution problem
        System.out.println("Solving question 30");
    }

    public static void arr31() {
        //Smallest Sub-array with sum greater than a given value
        System.out.println("Solving question 31");
    }

    public static void arr32() {
        //Three-way partitioning of an array around a given value
        System.out.println("Solving question 32");
    }

    public static void arr33() {
        //Minimum swaps required bring elements less equal K together
        System.out.println("Solving question 33");
    }

    public static void arr34() {
        //Minimum no. of operations required to make an array palindrome
        System.out.println("Solving question 34");
    }

    public static void arr35() {
        //Median of 2 sorted arrays of equal size
        System.out.println("Solving question 35");
    }

    public static void arr36() {
        //Median of 2 sorted arrays of different size
        System.out.println("Solving question 36");
    }


    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the question no: ");
        int que= sc.nextInt();
        switch (que){
            case 1-> arr1();
            case 2-> arr2();
            case 3-> arr3();
            case 4-> arr4();
            case 5-> arr5();
            case 6-> arr6();
            case 7-> arr7();
            case 8-> arr8();
            case 9-> arr9();
            case 10-> arr10();
            case 11-> arr11();
            case 12-> arr12();
            case 13-> arr13();
            case 14-> arr14();
            case 15-> arr15();
            case 16-> arr16();
            case 17-> arr17();
            case 18-> arr18();
            case 19-> arr19();
            case 20-> arr20();
            case 21-> arr21();
            case 22-> arr22();
            case 23-> arr23();
            case 24-> arr24();
            case 25-> arr25();
            case 26-> arr26();
            case 27-> arr27();
            case 28-> arr28();
            case 29-> arr29();
            case 30-> arr30();
            case 31-> arr31();
            case 32-> arr32();
            case 33-> arr33();
            case 34-> arr34();
            case 35-> arr35();
            case 36-> arr36();
            default-> System.out.println("INVALID INPUT");
        }
    }
}