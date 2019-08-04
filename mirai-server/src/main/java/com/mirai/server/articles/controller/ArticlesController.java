package com.mirai.server.articles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mirai.server.articles.domain.dto.ArticleRegisterReqMsg;
import com.mirai.server.articles.domain.entity.Articles;
import com.mirai.server.articles.service.ArticlesService;

@RestController
@RequestMapping(("/articles"))
@CrossOrigin
public class ArticlesController {

	@Autowired
	ArticlesService articlesService;

	@GetMapping("/list")
	public List<Articles> execute() {
		List<Articles> articles = articlesService.findAll();
		return articles;
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/save")
	public Articles save(@RequestBody ArticleRegisterReqMsg msg) {
		Articles article = new Articles();
		article.setId(Long.valueOf(0));
		article.setTitle(msg.getTitle());
		article.setContents(msg.getContents());
		article.setTopic(msg.getTopic());
		return articlesService.save(article);
	}

}
