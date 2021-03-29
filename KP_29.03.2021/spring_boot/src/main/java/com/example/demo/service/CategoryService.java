package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository taskRepository;

    public void create(Category category){
        taskRepository.save(category);
    }

    public List<Category> findAll(){
        return taskRepository.findAll();
    }

    public Category find(Long id){
        return taskRepository.getOne(id);
    }

    public void delete(Long id){
        taskRepository.delete(taskRepository.getOne(id));
    }
}
