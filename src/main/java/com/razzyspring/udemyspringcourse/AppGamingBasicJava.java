package com.razzyspring.udemyspringcourse;

import com.razzyspring.udemyspringcourse.game.GameRunner;
import com.razzyspring.udemyspringcourse.game.MarioGame;
import com.razzyspring.udemyspringcourse.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGamingBasicJava
{

	public static void main(String[] args)
	{
		SpringApplication.run(AppGamingBasicJava.class, args);
		//var game = new MarioGame();
		//var gameRunner = new GameRunner(marioGame);
		//gameRunner.run();

		var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
