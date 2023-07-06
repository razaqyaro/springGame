package com.razzyspring.udemyspringcourse;

import com.razzyspring.udemyspringcourse.game.GameRunner;
import com.razzyspring.udemyspringcourse.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGamingBasicJava
{

	public static void main(String[] args)
	{
		SpringApplication.run(AppGamingBasicJava.class, args);
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
