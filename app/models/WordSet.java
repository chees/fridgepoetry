package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class WordSet extends Model {
	public String author;
	public String title;
	public int width;
	public int height;
	public Date creationDate;
	
	public WordSet(String author, String title) {
		this.author = author;
		this.title = title;
		width = 800;
		height = 600;
		creationDate = new Date();
	}
}
