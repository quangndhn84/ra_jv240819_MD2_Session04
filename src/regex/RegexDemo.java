package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //1. x: đại diện cho 1 ký tự
        String regexStr = "Java";
        String inputStr = "Java";
        boolean result = Pattern.matches(regexStr, inputStr);
        System.out.println("Kết quả so khớp: " + result);
        //2. . đại diện cho 1 ký tự bât kỳ
        System.out.println("Kết quả so khớp với .: " + Pattern.matches("J.va", "Jbva"));
        //3. (ab|cd): hoặc ab hoặc cd
        System.out.println("Kết quả so khớp với (ab|cd): " + Pattern.matches("J(av|az)a", "Java"));
        //4. [abc]: hoặc a hoặc b hoặc c
        System.out.println("Kêt quả so khớp với [abc]: " + Pattern.matches("J[abc]va", "Jdva"));
        //5. [^abc]: không phải là a,b,c
        System.out.println("Kêt quả so khớp với [^abc]: " + Pattern.matches("J[^abc]va", "Jdva"));
        //6. [a-z]: Ký tự nằm trong khoảng a-z
        System.out.println("Kết quả so khớp với [a-z]: " + Pattern.matches("J[a-f]va[0-8]", "Java9"));
        //7. [^a-z]: Ký tự không nằm trong khoảng a-z
        System.out.println("Kết quả so khớp với [^a-z]: " + Pattern.matches("J[a-f]va[^0-8]", "Java9"));
        //8. [a-e[m-p]]: Ký tự nằm trong khoảng từ a-e, m-p
        System.out.println("Kết quả so khơp với [a-e[m-p]]: " + Pattern.matches("J[a-e[m-p]]va", "Jnva"));
        //9. [a-e&&[c-p]]: Ký tự nằm trong khoảng giao của 2 khoảng a-e và c-p
        System.out.println("Kết quả so khớp với [a-e&&[c-p]]: " + Pattern.matches("J[a-e&&[c-p]]va", "Jdva"));
        //10. \d: ký tự là 1 số trong khoảng từ 0-9
        System.out.println("Kết quả so khớp với \\d: " + Pattern.matches("Java\\d", "Java8"));
        //11. \D: Ký tự không phải là 1 số (digit)
        System.out.println("Kết quả so khớp với \\D: " + Pattern.matches("Java\\D", "Java8"));
        //12. \w: ký tự
        //13. \W: Không phải là ký tự
        //14. \s: ký tự là khoảng trắng
        //15. \S: Không phải là khoảng trắng
        //16. p*: đại diện cho 0, 1 hoặc nhiều ký tự p
        System.out.println("1. Kết quả so khớp p*: " + Pattern.matches("Ja*va", "Jva"));
        System.out.println("2. Kết quả so khớp p*: " + Pattern.matches("Ja*va", "Java"));
        System.out.println("3. Kết quả so khớp p*: " + Pattern.matches("Ja*va", "Jaaaaaaaaaava"));
        //17. p+: Đại diện cho 1 hoặc nhiều  ký tự p
        System.out.println("1. Kết quả so khớp p+: " + Pattern.matches("Ja+va", "Jva"));
        System.out.println("2. Kết quả so khớp p+: " + Pattern.matches("Ja+va", "Java"));
        System.out.println("3. Kết quả so khớp p+: " + Pattern.matches("Ja+va", "Jaaaaaaaaaava"));
        //18/ p?: đại diện cho 0 hoặc 1 ký tự p
        System.out.println("1. Kết quả so khớp p?: " + Pattern.matches("Ja?va", "Jva"));
        System.out.println("2. Kết quả so khớp p?: " + Pattern.matches("Ja?va", "Java"));
        System.out.println("3. Kết quả so khớp p?: " + Pattern.matches("Ja?va", "Jaaaaaaaaaava"));
        //19. p{n}: có n ký tự p
        System.out.println("1. Kết quả so khớp p{n}: " + Pattern.matches("Ja{2}va", "Jaava"));
        System.out.println("2. Kết quả so khớp p{n}: " + Pattern.matches("Ja{2}va", "Java"));
        //20. p{n,}: có ít nhất n ký tự p
        System.out.println("1. Kết quả so khớp p{n,}: " + Pattern.matches("Ja{2,}va", "Java"));
        System.out.println("2. Kết quả so khớp p{n,}: " + Pattern.matches("Ja{2,}va", "Jaava"));
        System.out.println("3. Kết quả so khớp p{n,}: " + Pattern.matches("Ja{2,}va", "Jaaaaaaaaaava"));
        //21. p{n,m}: Có từ n đến m ký tự p
        System.out.println("1. Kết quả so khớp p{n,m}: " + Pattern.matches("Ja{2,4}va", "Java"));
        System.out.println("2. Kết quả so khớp p{n,m}: " + Pattern.matches("Ja{2,4}va", "Jaaava"));
        System.out.println("3. Kết quả so khớp p{n,m}: " + Pattern.matches("Ja{2,4}va", "Jaaaaaaaaaava"));

        //Nhập vào mã sinh viên có 2 ký tự đầu là SV, 3 ký tự tiếp theo là số, nhập đúng thì thôi
        Scanner scanner = new Scanner(System.in);
        String studentIdRegex = "SV\\d{3}";
        String studentId;
        System.out.println("Nhập vào mã sinh viên:");
        do {
            studentId = scanner.nextLine();
            if (Pattern.matches(studentIdRegex, studentId)) {
                break;
            } else {
                System.err.println("Mã sinh viên không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Mã sinh viên vừa nhập là: " + studentId);
        //Nhập vào số điện thoại di động việt nam có đầu số là 091, 090, 098, gồm 10 số
        String phoneRegex = "0(91|90|98)\\d{7}";
        String phone;
        System.out.println("Nhập vào số điện thoại di động Việt Nam:");
        do {
            phone = scanner.nextLine();
            if (Pattern.matches(phoneRegex, phone)) {
                break;
            } else {
                System.err.println("Số điện thoại không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Số điện thoại vừa nhập: " + phone);

    }
}
