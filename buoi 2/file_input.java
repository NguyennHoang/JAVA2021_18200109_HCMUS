/*Bài tập 4: Cho biết kết quả hiển thị ra màn hình nếu file
“abc.txt” có nội dung:
3
ABC123
123ABC
AB12C3
*/
package baitap;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_input {

	public static void main(String[] args) {
		Scanner fileIn = null ; 
		try
		{
		fileIn = new Scanner( new FileInputStream("E:/java/baitap/abc.txt"));
		System.out.println("File " + (fileIn.hasNextLine() == Boolean.TRUE ? "co": "khong") + " du lieu");
		int i = 0;
		int cnt = fileIn.nextInt();
		System.out.println("So dong " + cnt);
		fileIn.nextLine();
		while(fileIn.hasNext())
		{
			i++;
			System.out.println( i + ". " + fileIn.nextLine());
		}
		fileIn.close();
		}
		catch (FileNotFoundException e)
		{
			
		System.out.println("File not found.");
		System.exit(0);
		}
	}

}
/* ket qua
File co du lieu
So dong 3
1. ABC123
2. 123ABC
3. AB12C3
*/
