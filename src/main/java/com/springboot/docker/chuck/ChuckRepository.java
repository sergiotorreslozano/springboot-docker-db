package com.springboot.docker.chuck;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChuckRepository extends JpaRepository<ChuckFact, Integer> {

}
