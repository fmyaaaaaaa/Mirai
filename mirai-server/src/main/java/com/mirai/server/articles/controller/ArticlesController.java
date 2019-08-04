package com.mirai.server.articles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirai.server.articles.domain.entity.Articles;
import com.mirai.server.articles.service.ArticlesService;

@RestController
public class ArticlesController {

	@Autowired
	ArticlesService articlesService;

	@RequestMapping("/articles")
	public List<Articles> execute() {
		List<Articles> articles = articlesService.findAll();
		return articles;
	}

}
