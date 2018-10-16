/**
 * 文件名称:          		HeapSortTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

import org.junit.Test;

/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 18:01
 * 
 */
public class HeapSortTest extends BaseTestCase {
    @ Test
    public void test() {
        System.out.println("堆排序==============================");
        ISort s = new HeapSort();
        s.sort(SortKit.instance().buildRandomArray(20, 1000));
    }

}
