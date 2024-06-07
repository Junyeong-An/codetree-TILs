import java.util.Scanner;  // Scanner 클래스를 import

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
        String number = scanner.nextLine();  // 사용자 입력을 문자열로 받음

        String studentName;  // 학생 이름을 저장할 변수
        if(number.equals("1"))
            studentName = "John";
        else if(number.equals("2"))
            studentName = "Tom";
        else if(number.equals("3"))
            studentName = "Paul";
        else
            studentName = "Vacancy";  // 해당되는 번호가 없을 경우

        System.out.println(studentName);  // 결과 출력
        scanner.close();  // Scanner 객체 닫기
    }
}