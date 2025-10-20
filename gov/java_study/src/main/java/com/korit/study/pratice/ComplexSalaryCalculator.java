package com.korit.study.pratice;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
        // 직급수당 계산
        int positionAllowance = position == 1 ? 0 :
                position ==  2 ? 500000 :
                position == 3 ? 1000000 :
                position == 4 ? 2000000 : -1;

        // 연차수당 계산 (기본급 기준 %) , 다운캐스팅
        int yearAllowance = (int)(workYears >= 0 && workYears < 3 ? baseSalary * 1 : workYears >= 3 && workYears <= 7 ? baseSalary * 0.05 : workYears >= 7 && workYears <= 15 ? baseSalary * 0.1 : baseSalary * 0.2);

        // 야근수당 계산
        int overtimePayment = overtimeHours <= 10 ? overtimeHours * 10000 : (100000 + (overtimeHours - 10) * 15000);

        // 특별보너스 계산
        int specialBonus = position == 4 && workYears >= 15 ? 500000 : 0 ;

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;

        // 세금 계산
        int tax = totalSalary <= 5000000 ? (int)(totalSalary * 0.1) : (int)(totalSalary * 0.15) ;

        // 실수령액 계산
        int finalSalary = totalSalary - tax;

        // 직급명 출력용
        String positionName = position == 1 ? "사원" : position ==  2 ? "대리" : position == 3 ? "과장" : position == 4 ? "부장" : "없음";


        //초과시간
        int over = overtimeHours > 10 ? overtimeHours - 10 : 0;
        int a = over > 0 ? 10 : overtimeHours;
        int b = over > 0 ? overtimeHours-10 : 0;

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급: " + positionName );
        System.out.println("직급수당: " + String.format("%,d", positionAllowance) + "원");
        System.out.println("연차수당: " + String.format("%,d", yearAllowance) + "원");
        System.out.println("야근수당: " + String.format("%,d", overtimePayment) + "원 (기본 " + a + "시간 + 초과 " + b + "시간)" );
        System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");
        System.out.println("총 지급액: " + String.format("%,d", totalSalary) + "원");
        System.out.println("세금: " + String.format("%,d", tax) + "원");
        System.out.println("실수령액: " + String.format("%,d", finalSalary) + "원");
        // 나머지 출력 구현
    }
}