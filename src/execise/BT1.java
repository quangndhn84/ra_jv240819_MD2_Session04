package execise;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        /*
         * 1. Nhập số phần tử của mảng, khai báo mảng, nhập giá trị cho mảng 1 chiều số nguyên
         * 2. Nhập chỉ số phần tử cần xóa
         * 3. Xóa phần tử bằng cách tạo mảng mới và copy các phần tử từ mảng cũ sang mảng mới
         * 4. In các phần tử sau khi xóa
         * */
        //1. Nhập giá trị cho các phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldNumbers = new int[size];
        for (int i = 0; i < oldNumbers.length; i++) {
            System.out.printf("oldNumber[%d]=", i);
            oldNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //2. Nhập chỉ số phần tử cần xóa
        System.out.println("Nhập vào chỉ số phần tử cần xóa:");
        int indexDelete = Integer.parseInt(scanner.nextLine());
        //3. Xóa phần tử
        if (indexDelete < 0 || indexDelete >= oldNumbers.length) {
            System.err.println("Chỉ số phần tử không tồn tại");
        } else {
            //Thực hiện xóa
            //-Bước 1: Tạo mảng mới có số phần tử bằng mảng cũ -1
            int[] newNumbers = new int[oldNumbers.length - 1];
            //-Buớc 2: thưc hiện copy các phần tử còn lại của mảng cũ sang mảng mới
            for (int i = 0; i < newNumbers.length; i++) {
                if (i < indexDelete) {
                    newNumbers[i] = oldNumbers[i];
                } else {
                    newNumbers[i] = oldNumbers[i + 1];
                }
            }
            //- Bước 3: In giá trị các phần tử còn lại
            System.out.println("Giá trị các phần tử sau khi xóa là:");
            for (int element : newNumbers) {
                System.out.printf("%d\t", element);
            }
            System.out.printf("\n");
        }
    }
}
