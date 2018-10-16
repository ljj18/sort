/**
 * 文件名称:          		AbstractSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 11:22
 * 
 */
public abstract class AbstractSort implements ISort {

    /**
     * 
     *
     */
    public void sort(int a[] ) {
        if (a == null || a.length == 0) {
            System.out.println("排序的数组不能为空....");
            return;
        }
        beforeSort(a);
        doSort(a);
        afterSort(a);
    }
    
    /**
     * 
     * @param a
     */
    public abstract void doSort(int a[]);
    
    private void beforeSort(int a[]) {
        System.out.println("排序前..............");
        SortKit.instance().dump(a, 10);
    }
    
    private void afterSort(int a[]) {
        System.out.println("排序后..............");
        SortKit.instance().dump(a, 10);
    }
}
