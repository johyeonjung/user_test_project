package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {


        //초기문, 조건문, 후처리문
        for (int i = 2; i < 100; i++) {
            if (i%4 ==0) {
                System.out.println(i);
            }
            i++;

        }

        for (int i =0; i < 21; i++ ) {
            if (i == 0) {
                continue;
            }
            else if (i%2 == 0) {
                System.out.printf("%d = 짝 \n",i);


            }
            else if (i%2 ==1) {
                System.out.printf("%d = 홀 \n",i);

            }


        }



        for (int i =0; i < 21; i++ ) {
            if (i != 0 ) {
                if (i%2 == 0) {
                    System.out.printf("%d = 짝 \n",i);


                }
                else if (i%2 ==1) {
                    System.out.printf("%d = 홀 \n",i);

                }

            }



        }

//        int i = 0;
//        while (i < 5) {
//            i++;
//        }


    }
}
