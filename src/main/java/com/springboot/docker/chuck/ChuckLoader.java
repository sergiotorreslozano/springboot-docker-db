package com.springboot.docker.chuck;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckLoader {

	private ChuckRepository repository;

	/**
	 * @param repository
	 */
	ChuckLoader(ChuckRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@PostConstruct
	void init() {
		repository.save(new ChuckFact(1,
				"Chuck Norris was bitten by a cobra and after five days of excruciating pain... the cobra died"));
		repository.save(new ChuckFact(2,
				"He who laughs last, laughs best. He who laughs at Chuck Norris, it's definitely his last laugh."));
		repository.save(new ChuckFact(3,
				"The easiest way to determine Chuck Norris's age is to cut him in half and count the rings"));
		repository.save(new ChuckFact(4,
				"Chuck Norris is currently suing NBC, claiming Law and Order are trademarked names for his left and right legs"));
		repository.save(new ChuckFact(5,
				"Chuck Norris doesn't dial the wrong number. You answered the wrong phone"));
		repository.save(new ChuckFact(6,
				"Chuck Norris knows Victoria's secret"));
		repository.save(new ChuckFact(7,
				"If Chuck Norris was a Spartan in the movie 300, the movie would be called 1"));
		repository.save(new ChuckFact(8,
				"When Chuck Norris turned 18, his parents moved out"));
		repository.save(new ChuckFact(9,
				"When Chuck Norris swims in the ocean, the sharks are in a steel cage"));
		repository.save(new ChuckFact(0,
				"Chuck Norris will never have a heart attack. His heart isn't nearly foolish enough to attack him"));
	}
	
	
}
