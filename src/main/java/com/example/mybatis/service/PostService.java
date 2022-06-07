/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.mybatis.service;

import com.example.mybatis.model.Post;
import java.util.List;


/**
 *
 * @author admin
 */
public interface PostService {

    public List<Post> findAll();
    public Post findById(long id);
    public int deleteById(long id);
    public int insert(Post post);
    public int update(Post post);
}
