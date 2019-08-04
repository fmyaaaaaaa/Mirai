package com.mirai.server.articles.domain.dto;

import lombok.Data;

@Data
public class ArticleRegisterReqMsg {

	private String title;

	private String contents;

	private String topic;

}
