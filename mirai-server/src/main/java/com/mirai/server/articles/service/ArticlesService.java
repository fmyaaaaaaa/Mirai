package com.mirai.server.articles.service;

import java.util.List;

import com.mirai.server.articles.domain.entity.Articles;

public interface ArticlesService {

	/**
	 * Articleを全件取得する。
	 * @return Articles
	 */
	List<Articles> findAll();
}
