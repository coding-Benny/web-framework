package kr.ac.hansung.cse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PetOwner {
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
