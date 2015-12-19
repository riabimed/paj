package fr.ensisa.apijava.game2048.common.model;

import java.util.HashMap;
import java.util.Map;

public class Player {

	private String name;
	private String image;
	private HashMap<String, Integer> score;
	
	public Player(String name, String image){
		this.name=name;
		this.image=image;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public HashMap<String, Integer> getScore() {
		if(score== null){
			score=new HashMap<String,Integer>();
		}
		return score;
	}

	public void setScore(HashMap<String, Integer> score) {
		this.score = score;
	}
	
	
}
