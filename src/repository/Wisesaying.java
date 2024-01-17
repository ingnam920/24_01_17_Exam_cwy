package repository;

public class Wisesaying {
	private int id;
	private String author;
	private String wise;
	
	public Wisesaying(int id, String author,String wise) {
		this.id=id;
		this.author=author;
		this.wise=wise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getWise() {
		return wise;
	}

	public void setWise(String wise) {
		this.wise = wise;
	}
	

}
