package com.mirai.server.articles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirai.server.articles.domain.entity.Articles;
import com.mirai.server.articles.repository.ArticlesRepository;

@Service
@Transactional
public class ArticlesServiceImpl implements ArticlesService{

	@Autowired
	ArticlesRepository articleRepository;

	@Override
	public List<Articles> findAll() {
		return articleRepository.findAll();
	}
}
