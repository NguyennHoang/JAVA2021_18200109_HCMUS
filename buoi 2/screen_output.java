/*
bai tap :xuat ra man hinh
0123456789  9876543210
01234567      76543210
012345          543210
0123              3210
01                  10
0123              3210
012345          543210
01234567      76543210
0123456789  9876543210
*/
package baitap;


public class screen_output {
    public static void main(String[] args) {
        System.out.printf("%-11s%11s", "0123456789", "9876543210");
        System.out.println();
        System.out.printf("%-11s%11s", "01234567", "76543210");
        System.out.println();
        System.out.printf("%-11s%11s", "012345", "543210");
        System.out.println();
        System.out.printf("%-11s%11s", "0123", "3210");
        System.out.println();
        System.out.printf("%-11s%11s", "01", "10");
        System.out.println();
        System.out.printf("%-11s%11s", "0123", "3210");
        System.out.println();
        System.out.printf("%-11s%11s", "012345", "543210");
        System.out.println();
        System.out.printf("%-11s%11s", "01234567", "76543210");
        System.out.println();
        System.out.printf("%-11s%11s", "0123456789", "9876543210");
        System.out.println();
    }
    
}