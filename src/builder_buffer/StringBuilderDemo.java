package builder_buffer;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //1. Khai báo 1 chuỗi String Builder có giá trị khởi tạo là Rikkei Academy
        StringBuilder strBuilder = new StringBuilder("Rikkei Academy");
        //2. str1.append(str2): Nối chuỗi 2 vào chuỗi 1
        strBuilder.append("- Học viện đào tạo CNTT");
        System.out.println("Chuỗi sau khi nối: " + strBuilder);
        //3. str1.insert(int offset, String str2): chèn chuỗi str2 vào vị trí offset
        strBuilder.insert(0, "Học viện ");
        System.out.println("Chuỗi sau khi chèn: " + strBuilder);
        //4. str.delete(int beginIndex, int endIndex): xóa dữ liệu từ vị trí beginIndex đến endIndex
        strBuilder.delete(0, 9);
        System.out.println("Chuỗi sau khi xóa: " + strBuilder);
        //5. str.reverse(): đảo ngược chuỗi
        strBuilder.reverse();
        System.out.println("Chuỗi sau khi đảo ngược: " + strBuilder);
        //6. str.toString(): Chuyển từ Builder sang String
        String str = strBuilder.toString();
    }
}
