package ai0409;

public class ai0409 {
    public static void main(String[] args) {
        // 1. 과목별 이수 학점 (Weight)
        int javaCredit = 3;
        int mobileCredit = 2;
        int excelCredit = 1;

        // 2. 과목별 성적 (Score)
        double javaGrade = 3.5;   // B
        double mobileGrade = 4.0; // A0
        double excelGrade = 4.5;  // A

        // 3. 평균 학점 계산 (연산자 우선순위 주의!)
        // (학점1*성적1 + 학점2*성적2 + 학점3*성적3) / 전체 학점 합계
        double totalPoints = (javaCredit * javaGrade) + (mobileCredit * mobileGrade) + (excelCredit * excelGrade);
        int totalCredits = javaCredit + mobileCredit + excelCredit;

        double averageGrade = totalPoints / totalCredits;

        // 4. 결과 출력
        System.out.println("----- 성적표 -----");
        System.out.printf("평균 학점 : %.2f\n", averageGrade);
        System.out.println("------------------");
    }
}

