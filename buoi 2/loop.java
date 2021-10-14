package baitap;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        //Loop (2)
        int n;
        n = 6;
        while (n-- > 0) {
            System.out.println(n);
        }
        /* Output:
        5
        4
        3
        2
        1
        0
        */

        n = 6;
        do {
            System.out.println(n);
        } while (--n > 0);
        /* Output:
        6
        5
        4
        3
        2
        1
        0
        */

        byte abc;
        abc = 112;
        do {
            System.out.println(abc);
        } while (++abc > 111 && abc++ > 112);
        /* Output:
        112
        114
        116
        118
        120
        122
        124
        126
        -128 -> do giới hạn của kiểu dữ liệu byte
        */


        // LOOPS (9) Tìm lỗi chương trình bên dưới
        String s = "";
        char c = ' ';
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter 'A' for your option A " + "or 'B' for option B.");
            s = keyboard.next( );
            s.toLowerCase( );
            c = s.charAt(0);
        } while ((c != 'a') || (c != 'b'));
        // Lỗi: điều kiện dừng của vòng lặp while sai
        //      câu lệnh s.toLowerCase sai
        // Sửa: đổi dấu '||' thành '&&'
        //      sửa thành  s=s.toLowerCase();
        keyboard.close();
    }
}