import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("milcho");
        Scanner sc = new Scanner(System.in);

        int stick = 64; // 기존 막대의 길이
        int X = sc.nextInt(); // 원하는 막대의 길이
        int count = 0; // 막대를 쪼갠 횟수

        while (X > 0) {
            if (stick > X) { // 막대의 길이가 X보다 큰 경우
                stick /= 2;
            } else { // 막대의 길이가 X보다 작은 경우
                count++; // count를 높인다
                X -= stick;
            }
        }
        System.out.println(count);
    }
}
