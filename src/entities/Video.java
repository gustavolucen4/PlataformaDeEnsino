package entities;

public class Video extends Lesson {

	private String url;
	private Integer seconds;
	
	public Video() {
	}
	
	public Video(String title, String url, int seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public int duration() {
		return seconds;
	}

}
