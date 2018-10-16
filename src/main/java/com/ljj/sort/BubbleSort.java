/**
 * 文件名称:          		BubbleSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 冒泡排序
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-15 16:34
 * 
 */
public class BubbleSort extends AbstractSort {

    /**
     * 
     * @param a
     */
    public void doSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    SortKit.instance().swap(a, j, j + 1);
                }
            }
        }
    }
}
