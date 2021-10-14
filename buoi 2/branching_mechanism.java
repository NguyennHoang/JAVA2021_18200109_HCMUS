package baitap;

//Bài tập: Cho biết kết quả chương trình
public class branching_mechanism {
	public static void main(String[] args) {
		char keyPess;
		keyPess = 'A';
		switch (keyPess) 
		{
			default:
				System.out.println("Program is still a live");
			case 'A':
			case 'a':
				System.out.println("Exit program");
				break;
		}
		/* Output:
		 Exit program
		
		 giải thích: chương trình sẽ chạy vào default khi không có case nào phù hợp. 
		 vì vậy trường hợp này sẽ chạy vào case A và chạy tới khi có break
		*/
		keyPess = 'B';
		switch (keyPess) 
		{
			default:
				System.out.println("Program is still a live");
			case 'A':
			case 'a':
				System.out.println("Exit program");
				break;
		}
		/* Output:
		 Program is still a live
		 Exit program
		
		 Giải thích: vì không có case phù hợp nên chương trình chạy vào default và chạy cho tới khi gặp break.
		 */
	}
}