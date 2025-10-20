package com.korit.study.ch08;

public class Array03 {
    static void main(String[] args) {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 0;
        int number = 18;
        //30을 찾기 위한 탐색 시도가 몇 번 있었는지와 30의 인덱스 위치를 출력하시오.

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                찾은인덱스 = i;
                break;
            }
            탐색횟수 += 1;
        }
        탐색횟수 = 탐색횟수 + 1;

        System.out.print(찾은인덱스 + ", " + 탐색횟수);



    }
}
