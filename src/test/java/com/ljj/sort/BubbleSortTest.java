/**
 * 文件名称:          		BubbleSortTest.java
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
 * Date			2018-10-15 17:24
 * 
 */
public class BubbleSortTest extends BaseTestCase {

    @ Test
    public void test() {
        System.out.println("冒泡排序==============================");
        ISort s = new BubbleSort();
        s.sort(SortKit.instance().buildRandomArray(20, 1000));
    }

}
