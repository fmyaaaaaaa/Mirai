package com.mirai.server.articles.service;

import java.util.List;

import com.mirai.server.articles.domain.entity.Articles;

public interface ArticlesService {

	/**
	 * Articleを全件取得する。
	 * @return Articles
	 */
	List<Articles> findAll();

	/**
	 * Articleを保存します。
	 *
	 * @param entity 保存対象となるentity
	 * @return Articles
	 */
	Articles save(Articles entity);
}
