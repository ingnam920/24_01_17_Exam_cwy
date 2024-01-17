package controller;

import java.util.ArrayList;
import java.util.List;

import WiseSayingService.WisesayingService;
import repository.Wisesaying;

public class WiseSayingController {
	WisesayingService wisesayingservice;
	
	
	public WiseSayingController() {
		wisesayingservice=new WisesayingService();
	}
	
	public void 등록() {
		wisesayingservice.등록();
	}
	public void 수정(int num) {
		wisesayingservice.수정(num);
	}
	public void 삭제(int num) {
		wisesayingservice.삭제(num);
	}
	public void 상세보기(int num) {
		wisesayingservice.상세보기(num);
	}
	public void 목록() {
		wisesayingservice.목록();
	}
	
	

}
