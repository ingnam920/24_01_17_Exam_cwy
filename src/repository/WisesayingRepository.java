package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.WiseSayingController;

public class WisesayingRepository {
	List<Wisesaying> wisesayings;
	Scanner sc;
	private int id = 0;

	public WisesayingRepository() {
		wisesayings = new ArrayList();
		sc = new Scanner(System.in);
	}

	public void 등록() {
		System.out.print("명언 :");
		String str1 = sc.nextLine().trim();
		System.out.print("작가 :");
		String str2 = sc.nextLine().trim();
		Wisesaying ws = new Wisesaying(id + 1, str1, str2);
		wisesayings.add(ws);
		System.out.println(id + "번 명언이 등록되었습니다.");
		id++;
	}

	public void 수정(int num) {
		if (wisesayings.get(num) == null) {
			System.out.println(num + " 번 명언은 존재하지않아요");
		} else {
			System.out.println("명언(기존) : " + wisesayings.get(num).getWise());
			System.out.println("작가(기존) : " + wisesayings.get(num).getAuthor());
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			wisesayings.get(num).setAuthor(str1);
			;
			wisesayings.get(num).setWise(str2);
			System.out.println(num + "번 명언이 수정되었습니다.");
		}
	}

	public void 삭제(int num) {
		if (wisesayings.get(num) == null) {
			System.out.println(num + " 번 명언은 존재하지않아요");
		}
		else {
		wisesayings.remove(num);
		}
	}

	public void 상세보기(int num) {
		if (wisesayings.get(num) == null) {
			System.out.println(num + " 번 명언은 존재하지않아요");
		}
		else {
			System.out.println(wisesayings.get(num).getWise() + wisesayings.get(num).getAuthor());
		}
	}

	public void 목록() {

		for (Wisesaying a : wisesayings) {
			System.out.println(a.getId() + a.getAuthor() + a.getWise());
		}
	}

}
