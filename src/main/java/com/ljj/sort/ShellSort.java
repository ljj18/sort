/**
 * 文件名称:          		ShellSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 希尔排序
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- 根据步长序列的不同而不同。已知最好的为O(n(logn)^2)
 * 最优时间复杂度 ---- O(n)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 不稳定
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-16 15:48
 * 
 */
public class ShellSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        int h = 0;
        while (h <= a.length) // 生成初始增量
        {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                int j = i - h;
                int k = a[i];
                while (j >= 0 && a[j] > k) {
                    a[j + h] = a[j];
                    j = j - h;
                }
                a[j + h] = k;
            }
            h = (h - 1) / 3; // 递减增量
        }

    }

}
