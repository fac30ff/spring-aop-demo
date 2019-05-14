package com.github.fac30ff.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.data[random.nextInt(this.data.length)];
	}
}
