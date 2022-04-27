package model;

public class Mv_VO {
	private int mNum;
	private String mName;
	private String onAir;
	private String genre;
	private String nation;
	private String showTime;
	private String release;
	
	private String dName;
	private String actors;
	private String rAge;
	private int rAgeInt;
	
	private int rank;
	private String story;
	private int stock;
	private int price;
	
	public int getmNum() {
		return mNum;
	}
	public String getmName() {
		return mName;
	}
	public String getOnAir() {
		return onAir;
	}
	public String getGenre() {
		return genre;
	}
	public String getNation() {
		return nation;
	}
	public String getShowTime() {
		return showTime;
	}
	public String getRelease() {
		return release;
	}
	public String getdName() {
		return dName;
	}
	public String getActors() {
		return actors;
	}
	public String getrAge() {
		return rAge;
	}
	public int getrAgeInt() {
		return rAgeInt;
	}
	public int getRank() {
		return rank;
	}
	public String getStory() {
		return story;
	}
	public int getStock() {
		return stock;
	}
	public int getPrice() {
		return price;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public void setOnAir(String onAir) {
		this.onAir = onAir;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public void setShowTime(String showTimeString) {
		this.showTime = showTimeString;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public void setrAge(String rAge) {
		this.rAge = rAge;
	}
	public void setrAgeInt(int rAgeInt) {
		this.rAgeInt = rAgeInt;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[" + mNum + "]" + mName + " | " + onAir + " | " + genre + " | "
				+ nation + " | " + showTime + " | " + release + " | " + dName
				+ " | " + actors + " | " + rAge + " | " + rAgeInt + " | " + rank + " | "
				+ story + " | " + stock + " | " + price;
	}

}