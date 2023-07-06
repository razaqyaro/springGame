package com.razzyspring.udemyspringcourse;

import com.razzyspring.udemyspringcourse.game.GameRunner;
import com.razzyspring.udemyspringcourse.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemySpringCourseApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(UdemySpringCourseApplication.class, args);
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
