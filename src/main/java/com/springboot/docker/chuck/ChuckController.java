package com.springboot.docker.chuck;

import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ChuckController {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private ChuckRepository repository;

	/**
	 * @param repository
	 */
	ChuckController(ChuckRepository repository) {
		super();
		this.repository = repository;
	}

	@RequestMapping("/chuck")
	public @ResponseBody ChuckFact greeting() {
		log.debug("Got a request!");
		Random r = new Random();
		return repository.findOne(r.nextInt(10));
	}
}
