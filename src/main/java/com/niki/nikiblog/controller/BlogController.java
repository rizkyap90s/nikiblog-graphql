

package com.niki.nikiblog.controller;

import com.niki.nikiblog.constant.MessageConstant;
import com.niki.nikiblog.model.Blog;
import com.niki.nikiblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class BlogController {


    @Autowired
    private BlogService blogService;

    @QueryMapping
    public Blog getBlogById(@Argument String id){
        return blogService.getBlogById(id);
    }

    @MutationMapping
    public Blog createBlog(@Argument String title, @Argument String content, @Argument String category, @Argument String author, @Argument String date){
        return blogService.createBlog(title, content, category, author, date);
    }

    @QueryMapping
    public List<Blog> getBlogs(){
        return blogService.getBlogs();
    }

    @MutationMapping
    public String deleteBlog(@Argument String id){
        blogService.deleteBlog(id);
        return MessageConstant.SUCCESS_DELETED;
    }

}
