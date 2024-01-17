import java.util.Scanner;

import controller.WiseSayingController;

public class Run {
	public void run() {
		WiseSayingController wisesayingcontroller = new WiseSayingController();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("== 명언 앱 실행 ==");
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine();
			
			wisesayingcontroller.등록();
			wisesayingcontroller.목록();
		}

	}
}
