package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public void create(News news){
        newsRepository.save(news);
    }

    public List<News> findAll(){
        return newsRepository.findAll();
    }

    public Optional<News> find(Long id){
        return newsRepository.findById(id);
    }

    public void delete(Long id){
        newsRepository.deleteById(id);
    }
}
