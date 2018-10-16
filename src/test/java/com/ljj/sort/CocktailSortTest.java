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
public class CocktailSortTest extends BaseTestCase {

    @ Test
    public void test() {
        ISort s = new CocktailSort();
        System.out.println("定向冒泡排序==============================");
        s.sort(SortKit.instance().buildRandomArray(200, 1000));
    }

}
