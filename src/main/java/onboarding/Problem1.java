package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // 포비 왼쪽 페이지 숫자 쪼개기
        int pobiLeftNum = pobi.get(0);
        List<Integer> pobiLeftSlice = new ArrayList<>();
        while (pobiLeftNum != 0) {
            pobiLeftSlice.add(pobiLeftNum % 10);    // 일의 자리부터 리스트에 저장 ex)97 / 10을 하여 나머지인 7 저장
            pobiLeftNum /= 10;  // 9가 되며, 다음 add(pobiLeftNum % 10)을 통해 9가 저장됨
        }
        // 포비 왼쪽 페이지의 합, 곱 계산
        int pobiLeftSum = 0;
        int pobiLeftMul = 1;
        for (int i : pobiLeftSlice) {
            pobiLeftSum += i;
            pobiLeftMul *= i;
        }
        // 포비 오른쪽 페이지 숫자 쪼개기
        int pobiRightNum = pobi.get(1);
        List<Integer> pobiRightSlice = new ArrayList<>();
        while (pobiRightNum != 0) {
            pobiRightSlice.add(pobiRightNum % 10);
            pobiRightNum /= 10;
        }
        // 포비 오른쪽 페이지의 합, 곱 계산
        int pobiRightSum = 0;
        int pobiRightMul = 1;
        for (int i : pobiRightSlice) {
            pobiRightSum += i;
            pobiRightMul *= i;
        }
        // 포비 가장 큰 숫자 구하기: Math.max는 두 값만 비교 가능하므로 좌우 페이지의 합/곱에 대한 최댓값을 구한 뒤 총 최댓값을 구함
        int pobiMax = Math.max(Math.max(pobiLeftSum, pobiLeftMul), Math.max(pobiRightSum, pobiRightMul));
        // 크롱 왼쪽 페이지 숫자 쪼개기
        int crongLeftNum = crong.get(0);
        List<Integer> crongLeftSlice = new ArrayList<>();
        while (crongLeftNum != 0) {
            crongLeftSlice.add(crongLeftNum % 10);
            crongLeftNum /= 10;
        }
        // 크롱 왼쪽 페이지의 합, 곱 계산
        int crongLeftSum = 0;
        int crongLeftMul = 1;
        for (int i : crongLeftSlice) {
            crongLeftSum += i;
            crongLeftMul *= i;
        }
        // 크롱 오른쪽 페이지 숫자 쪼개기
        int crongRightNum = crong.get(1);
        List<Integer> crongRightSlice = new ArrayList<>();
        while (crongRightNum != 0) {
            crongRightSlice.add(crongRightNum % 10);
            crongRightNum /= 10;
        }
        // 크롱 오른쪽 페이지의 합, 곱 계산
        int crongRightSum = 0;
        int crongRightMul = 1;
        for (int i : crongRightSlice) {
            crongRightSum += i;
            crongRightMul *= i;
        }
        // 크롱 가장 큰 숫자 구하기
        int crongMax = Math.max(Math.max(crongLeftSum, crongLeftMul), Math.max(crongRightSum, crongRightMul));
        int answer = Integer.MAX_VALUE;
        // 승패에 따라 결과 출력
        if (pobiMax == crongMax)
            answer = 0;
        if (pobiMax > crongMax)
            answer = 1;
        if (pobiMax < crongMax)
            answer = 2;
        // 예외처리: 홀수-짝수 페이지가 연속된 숫자가 아닐 경우 -1 반환, 마지막에 두지 않으면 값 덮어 씌어짐
        if (pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1)
            answer = -1;
        // 확인용 출력
        System.out.println(pobiLeftSum + ", " + pobiLeftMul + ", " + pobiRightSum + ", " + pobiRightMul);
        System.out.println(crongLeftSum + ", " + crongLeftMul + ", " + crongRightSum + ", " + crongRightMul);
        System.out.println(pobiMax + ", " + crongMax);
        System.out.println(answer);
        //
        return answer;
    }
// 확인용 main
    public static void main(String[] args) {
        List<Integer> pobi = List.of(99, 102);
        List<Integer> crong = List.of(211, 212);
        solution(pobi, crong);
    }
}