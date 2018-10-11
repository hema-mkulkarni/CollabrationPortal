package com.dteja.dao;

import java.util.List;

import com.dteja.model.BlogComment;

public interface BlogCommentDAO {
	public boolean addComment(BlogComment blogComment);
	public boolean updateComment(BlogComment blogComment);
	public boolean deleteComment(BlogComment blogComment);
	public BlogComment getBlogComment(int blogCommentId);
	public List<BlogComment> listBlogComments(int blogId);
}