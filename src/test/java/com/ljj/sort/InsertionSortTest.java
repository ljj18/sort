/**
 * 文件名称:          		InsertionSortTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

import org.junit.Test;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 15:20
 * 
 */
public class InsertionSortTest extends BaseTestCase {
    
    @ Test
    public void test() {
        System.out.println("插入排序==============================");
        ISort s = new InsertionSort();
        s.sort(SortKit.instance().buildRandomArray(20, 1000));
    }

}
