/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mybatis.serviceImpl;

import com.example.mybatis.model.Post;
import com.example.mybatis.repository.PostMyBatisRepository;
import com.example.mybatis.service.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostMyBatisRepository batisRepository;
    @Override
    public List<Post> findAll() {
        return batisRepository.findAll();
    }
    @Override
    public Post findById(long id) {
        return batisRepository.findById(id);
    }
    @Override
    public int deleteById(long id) {
        return batisRepository.deleteById(id);
    }
    @Override
    public int insert(Post post) {
        return batisRepository.insert(post);
    }
    @Override
    public int update(Post post) {
        return batisRepository.update(post);
    }
    
}
