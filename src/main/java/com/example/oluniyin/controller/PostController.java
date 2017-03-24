package com.example.oluniyin.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Secured("ROLE_GUEST")
	@RequestMapping("/list")
	public String list() {
		return "list pmosts...";
	}

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/add")
	public String addpost() {
		return "add posts..";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts(){
		return " view drafts ...";
	}

}
