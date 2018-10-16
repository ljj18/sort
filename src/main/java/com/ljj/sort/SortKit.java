/**
 * 文件名称:          		SortKit.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

import java.util.Random;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-15 16:26
 * 
 */
public class SortKit {

    private static final SortKit instance = new SortKit();
    
    public static SortKit instance() {
        return instance;
    }
    
    /**
     * 
     * @param a
     * @param i
     * @param j
     * @return
     */
    public boolean swap(int a[], int i, int j) {
        if (a == null || i >= a.length || j >= a.length) {
            return false;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return true;
    }
    
    /**
     * 
     * @param a
     * @param column 一行输出多少列
     */
    public void dump(int a[], int column) {
        if (a == null || a.length == 0) {
            System.out.println("array is null");
        }
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && i % column == 0) {
                System.out.println();
            }
            System.out.print(a[i]);
            System.out.print("\t"); 
        }
        System.out.println("");
    }
    
    /**
     * 
     * @param len
     * @return
     */
    public int[] buildRandomArray(int len, int max) {
       if (len <= 0) {
           return null;
       }
       Random random =  new Random();
       int a[] = new int[len];
       for(int i = 0; i < len; i++) {
           a[i] = random.nextInt(max);
       }
       return a;
    }
}
