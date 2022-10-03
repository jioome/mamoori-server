package com.mamoori.mamooriback.entity;

import javax.persistence.*;

import com.mamoori.mamooriback.oauth.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Will extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;

	@Column
	private String content;

	@Column
	private String receiver;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;


}
