package com.dteja.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BlogComment {
	@Id
	private int blogCommentId;
	String commentText;
	
}