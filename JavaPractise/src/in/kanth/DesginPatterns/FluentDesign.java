package in.kanth.DesginPatterns;

public class FluentDesign {

	private String topic;

	private Integer idno;

	private String author;

	private String genre;

	public FluentDesign(BookBuild build) {
		this.topic=build.topic;
		this.idno=build.idno;
		setAuthor(build.author);
		setGenre(build.genre);
	}

	public static BookBuild newBookBuild() {
		return new BookBuild();
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getIdno() {
		return idno;
	}

	public void setIdno(Integer idno) {
		this.idno = idno;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static final class BookBuild {

		private String topic;

		private Integer idno;

		private String author;

		private String genre;

		public BookBuild topic(String topic) {
			this.topic = topic;
			return this;
		}

		public BookBuild idno(Integer idno) {
			this.idno = idno;
			return this;
		}

		public BookBuild author(String author) {
			this.author = author;
			return this;
		}

		public BookBuild genre(String genre) {
			this.genre = genre;
			return this;
		}

		public FluentDesign build() {
			return new FluentDesign(this);
		}
	}

}
