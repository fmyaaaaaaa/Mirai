package com.mirai.server.articles.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ARTICLES")
@Data
public class Articles implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Long id;

	@Column(name="title")
	private String title;

	@Column(name="contents")
	private String contents;

	@Column(name="topic")
	private String topic;

}
