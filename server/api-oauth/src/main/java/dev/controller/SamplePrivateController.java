package dev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SamplePrivateController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/welcome/{name}")
	public ResponseEntity<String> getMessage(@PathVariable(value="name") String name) {
		try {
			String msg = "Hi, mr. " + name;
			return new ResponseEntity<>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
