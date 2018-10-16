/**
 * 文件名称:          		ShellSortTest.java
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
 * Date			2018-10-16 15:51
 * 
 */
public class ShellSortTest extends BaseTestCase {

    @ Test
    public void test() {
        System.out.println("希尔排序==============================");
        ISort s = new ShellSort();
        s.sort(SortKit.instance().buildRandomArray(200, 100000));
    }

}
