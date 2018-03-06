package com.kbank.devopstraining.toystore.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

	@Autowired 
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnSayHi() throws Exception {
		// fail("Not yet implemented");
		mockMvc.perform(get( "/sayHiJson/dora")).andExpect(status().is(200))
		.andExpect(jsonPath("$.message").value("dora"));
	}

}
