/**
 * 文件名称:          		CocktailSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 定向冒泡排序
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- 如果序列在一开始已经大部分排序过的话,会接近O(n)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 11:14
 * 
 */
public class CocktailSort extends AbstractSort {

    /**
     * 
     *
     */
    public void doSort(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (a[i] > a[i + 1]) {
                    SortKit.instance().swap(a, i, i + 1);
                }
            }
            right--;
            for (int j = right; j > left; j--) {
                if (a[j] < a[j  - 1]) {
                    SortKit.instance().swap(a, j, j - 1);
                }
            }
        }
    }
}
