package com.chainsys.day9;

public class BookReview {

		String title;
		String author;
		String language;
		String subject;
		int publishedyear;

    public BookReview() {
     }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title.matches("[a-zA-Z0-9]+")) {
			this.title = title;
		}else {
			System.out.println("INVALID!,GIVE PROPER INPUT");
		}
	}
		

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
			this.author = author;
	}
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		if(language.matches("[a-zA-Z]+")) {
			this.language = language;
		}else {
			System.out.println("INVALID!,GIVE PROPER INPUT");
		}
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject.matches("[a-zA-Z]+")) {
			this.subject = subject;
		}else {
			System.out.println("INVALID!,GIVE PROPER INPUT");
		}
	}

	public int getPublishedyear() {
		return publishedyear;
	}

	public void setPublishedyear(int publishedyear) {
		if(publishedyear>0&&publishedyear<2024) {
			this.publishedyear = publishedyear;
		}else {
			System.out.println("INVALID!,GIVE PROPER PUBLICATION YEAR");
		}
	}

	@Override
	public String toString() {
		return "BookReview [title=" + title + ", author=" + author + ", language=" + language + ", subject=" + subject
				+ ", publishedyear=" + publishedyear + "]";
	}
    
}

