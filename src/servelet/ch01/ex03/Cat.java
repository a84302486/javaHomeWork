package servelet.ch01.ex03;

import java.io.Serializable;

public class Cat extends Mammal implements Serializable {

	public Cat(long birthday) {
		super(birthday);
	}
	public Cat(String name, long birthday){
		super(name,birthday);
	}
	
}
