package com.korit.study.ch20;

import com.korit.study.ch01.Casting;

public class StaticMain {
    static void main(String[] args) {
          String str = "본인이름";
        StaticStudy staticStudy = new StaticStudy();
        staticStudy.print(str);
//        StaticStudy.print("본인이름");

        Casting.main(null);
        staticStudy.testt();
        staticStudy.age = 10;
        System.out.println(staticStudy.age);
        System.out.println(staticStudy.age2);
        StaticStudy.age2= 20;
        System.out.println(staticStudy.age2);
        staticStudy.age2 = 30;
        System.out.println(staticStudy.age2);
        StaticStudy s2 = new StaticStudy();
        s2.age2 = 50;
        System.out.println(staticStudy.age2);



    }

}
