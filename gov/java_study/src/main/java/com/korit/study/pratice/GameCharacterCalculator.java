package com.korit.study.pratice;
public class GameCharacterCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int level = 75;
        int jobCode = 1;
        int equipGrade = 4;
        int skillPoints = 95;

        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier = jobCode == 1 ? 1.5 : jobCode == 2 ? 1.2 : jobCode == 3 ? 1.3 : jobCode == 4 ? 1.1 : 1;

        // 기본 능력치 계산
        int baseStats = (int)(level * jobMultiplier);

        // 장비 보정 계산 (%)
        double equipBonus = equipGrade == 1 ? 0 : equipGrade == 2 ? baseStats * 0.1 : equipGrade == 3 ? baseStats * 0.25 : equipGrade == 4 ? baseStats * 0.5 : baseStats ;

        // 스킬 보너스 계산 (최대 50%)
        int x = skillPoints / 10 ;

        double skillBonus = skillPoints >= 10 ? baseStats * 0.2 : baseStats * (skillPoints / 10) * 0.05;

        // 직업 특성 보너스 계산
        double jobSpecialBonus = jobCode == 1 && level >= 50 ? baseStats * 0.2 : jobCode == 2 && skillPoints >= 80 ? baseStats * 0.3 :
                jobCode == 4 && equipGrade  >= 4 ? baseStats * 0.4: 0 ;

        // 최종 능력치 계산
        int finalStats = (int)(baseStats + equipBonus + skillBonus + jobSpecialBonus);

        // 전투력 등급 계산
        String combatRank = finalStats >= 8000 ? "S" : finalStats >= 6000 ? "A" : finalStats >= 4000 ? "B" : finalStats >= 2000 ? "C" : "D" ;

        // 직업명 계산
       String jobName = jobCode == 1 ? "전사": jobCode == 2 ? "마법사" : jobCode == 3 ? "궁수" : jobCode == 4 ? "도적" : "없음";
        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");
        System.out.println(x);
        System.out.println(baseStats * 0.45  );

        System.out.println(jobName);
        System.out.println(baseStats);
        System.out.println(equipBonus);
        System.out.println(skillBonus);
        System.out.println(jobSpecialBonus);
        System.out.println(finalStats);
        System.out.println(combatRank);
        // 출력 구현
    }
}
