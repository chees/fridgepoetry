package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Word extends Model {
	@ManyToOne
	public WordSet wordSet;
	public String word;
	public int x;
	public int y;
	
	public Word(WordSet wordSet, String word) {
		this.wordSet = wordSet;
		this.word = word;
	}
}
