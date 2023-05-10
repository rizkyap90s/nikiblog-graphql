package com.niki.nikiblog.service;

import com.niki.nikiblog.model.Blog;

import java.util.List;

public interface BlogService {

    Blog getBlogById(String id);

    Blog createBlog(String title, String content, String category, String author, String date);

    List<Blog> getBlogs();

    void deleteBlog(String id);

}
