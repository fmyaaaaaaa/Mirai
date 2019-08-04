package com.mirai.server.articles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirai.server.articles.domain.entity.Articles;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Long>{

}
