package Programmers.LV1;

//뒷 4자리 제외 나머지 숫자를 *로 바꾸기
class Solution{
    public String solution(String phone_number){
        if (phone_number.length() <= 4) {
            return phone_number;
        }

        // 뒷 4자리를 제외한 나머지 부분을 *로 변경
        String masked = "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);

        return masked;
    }
}
public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = s.solution("01033334444");
        System.out.println(a);

    }
}
