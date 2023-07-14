package com.razzyspring.udemyspringcourse;

import com.razzyspring.udemyspringcourse.game.GameRunner;
import com.razzyspring.udemyspringcourse.game.GamingConsole;
import com.razzyspring.udemyspringcourse.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration
{
		@Bean
		public GamingConsole game()
		{
			var game = new PacmanGame();
			return game;
		}

		@Bean
		public GameRunner gameRunner(GamingConsole game)
		{
			var gameRunner = new GameRunner(game);
			return gameRunner;
		}
//		SpringApplication.run(GamingConfiguration.class, args);
//		//var game = new MarioGame();
//		//var gameRunner = new GameRunner(marioGame);
//		//gameRunner.run();
//
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}


