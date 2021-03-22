package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestApiController {
    private final NewsService newsService;

    @Autowired
    public RestApiController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping(value = "/api/news")
    public ResponseEntity<?> create(@RequestBody News news) {
        newsService.create(news);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/news")
    public ResponseEntity<?> findAll() {
        final List<News> newsList = newsService.findAll();

        return newsList != null && !newsList.isEmpty()
                ? new ResponseEntity<>(newsList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/news/{id}")
    public ResponseEntity<Optional<News>> find(@PathVariable(name = "id") Long id) {
        final Optional<News> news = newsService.find(id);

        return news.isPresent()
                ? new ResponseEntity<>(news, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/news/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        final Optional<News> news = newsService.find(id);
        newsService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}
