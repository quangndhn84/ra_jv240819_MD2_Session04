package execise;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        /*
         * 1. Nhập số phần tử , khai báo và nhập giá trị cho 2 mảng số nguyên 1 chiều
         * 2. Gộp 2 mảng thành 1 mảng mới
         * 3. In giá trị các phần tử sau khi gộp
         * */
        //1. Nhập số phần tử , khai báo và nhập giá trị cho 2 mảng số nguyên 1 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng thứ nhất:");
        int firstSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số phần tử của mảng thứ hai:");
        int secondSize = Integer.parseInt(scanner.nextLine());
        int[] firstNumbers = new int[firstSize];
        int[] secondNumbers = new int[secondSize];
        System.out.println("Nhập giá trị các phần tử của mảng thứ nhất:");
        for (int i = 0; i < firstNumbers.length; i++) {
            System.out.printf("firstNumbers[%d]=", i);
            firstNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập giá trị các phần tử của mảng thứ hai:");
        for (int i = 0; i < secondNumbers.length; i++) {
            System.out.printf("secondNumbers[%d]=", i);
            secondNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //2. Gộp 2 mảng thành 1 mảng mới
        //-B1: Khai báo mảng gộp có số phần tử bằng tổng số phần tử của 2 mảng cũ
        int[] numbers = new int[firstNumbers.length + secondNumbers.length];
        //-B2: Khai báo và khởi tạo chỉ số currentIndex(chỉ số phần tử nhỏ nhât chưa chứa giá trị) bằng 0
        int currentIndex = 0;
        //-B3: Copy các phần tử mảng 1 sang numbers
        for (int i = 0; i < firstNumbers.length; i++) {
            numbers[currentIndex] = firstNumbers[i];
            currentIndex++;
        }
        //-B4: copy các phần tử mảng 2 sâng numbers
        for (int i = 0; i < secondNumbers.length; i++) {
            numbers[currentIndex] = secondNumbers[i];
            currentIndex++;
        }
        //3. In ra mảng gộp
        System.out.println("Các phần tử của mảng sau khi gộp:");
        for (int element : numbers) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");
    }
}
