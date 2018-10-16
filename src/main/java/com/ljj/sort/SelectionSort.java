/**
 * 文件名称:          		SelectionSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 选择排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- O(n^2)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 不稳定
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 14:30
 * 
 */
public class SelectionSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                SortKit.instance().swap(a, i, min);
            }
        }
    }

}
