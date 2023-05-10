package com.niki.nikiblog.service.impl;

import com.niki.nikiblog.model.Blog;
import com.niki.nikiblog.repository.BlogRepository;
import com.niki.nikiblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog getBlogById(String id) {
        Optional<Blog> result = blogRepository.findById(id);
        if (result.isPresent()) return result.get();
        return null;
    }

    @Override
    public Blog createBlog(String title, String content, String category, String author, String date) {
        Blog newData = blogRepository.save(new Blog(null, title, content, category, author, date));
        return newData;
    }

    @Override
    public List<Blog> getBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public void deleteBlog(String id) {
        blogRepository.deleteById(id);

    }
}
