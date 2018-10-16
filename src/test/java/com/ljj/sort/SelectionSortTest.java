/**
 * 文件名称:          		SelectionSortTest.java
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
 * Date			2018-10-16 14:57
 * 
 */
public class SelectionSortTest extends BaseTestCase {


    @ Test
    public void test() {
        System.out.println("选择排序==============================");
        ISort s = new SelectionSort();
        s.sort(SortKit.instance().buildRandomArray(20, 1000));
    }

}
