package com.korit.study.pratice;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id, code, name, home;
        int amount, price, post, total, fee, total2;



        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        System.out.print("고객 ID를 입력하세요: ");
        id = scanner.nextLine();

        System.out.print("상품 코드를 입력하세요: ");
        code = scanner.nextLine();

        System.out.print("상품명을 입력하세요: ");
        name = scanner.nextLine();

        System.out.print("수량을 입력하세요: ");
        amount = scanner.nextInt();

        System.out.print("단가를 입력하세요: ");
        price = scanner.nextInt();

        System.out.print("우편번호를 입력하세요: ");
        post = scanner.nextInt();

        scanner.nextLine();

        System.out.print("배송 주소를 입력하세요: ");
        home = scanner.nextLine();

        total = amount * price;
        fee = total >= 30000 ? 0 : 3000;

        String isfree = fee == 0 ? "무료 (3만원 이상 구매)" : "3000원";

        total2 = total+fee;



        System.out.println("=== 주문 확인서 ===");
        System.out.printf("""
                고객 ID: %s
                상품 정보:
                    - 상품코드: %s
                    - 상품명: %s
                    - 단가: %,d원 x %d개 = %,d원
                배송 정보:
                    - 우편번호: %d
                    - 주소: %s
                    - 배송비: %s
                총 결제 금액: %,d원""",
                id,
                code,
                name,
                price,
                amount,
                total,
                post,
                home,
                isfree,
                total2 );

        scanner.close();


    }
}
