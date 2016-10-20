package com.tmaxsoft.tp4;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodSelectingController {
	@RequestMapping("/WhatToEat")
    public Selecting selecting(@RequestParam(value="food", defaultValue="") String name) {

		Random rand = new Random();
		return new Selecting(rand.nextInt(10000));
    }
}
