package com.niki.nikiblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Blog {
    private String id;
    private String title;
    private String content;
    private String category;
    private String author;
    private String date;
}
