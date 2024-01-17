package WiseSayingService;

import repository.WisesayingRepository;

public class WisesayingService {
	WisesayingRepository wisesayingrepository;
	
	public WisesayingService() {
		wisesayingrepository=new WisesayingRepository();
	}
	
    public void 등록() {
    	wisesayingrepository.등록();
	}
	public void 수정(int num) {
		wisesayingrepository.수정(num);
	}
	public void 삭제(int num) {
		wisesayingrepository.삭제(num);
	}
	public void 상세보기(int num) {
		wisesayingrepository.상세보기(num);
	}
	public void 목록() {
		wisesayingrepository.목록();
	}

}
