/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.mybatis.repository;

import com.example.mybatis.model.Post;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author admin
 */
@Mapper
public interface PostMyBatisRepository {
    @Select("select * from post")
    public List<Post> findAll();

    @Select("SELECT * FROM post WHERE idpost = #{id}")
    public Post findById(long id);

    @Delete("DELETE FROM post WHERE idpost = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO post(titulo, descripcion) " +
        " VALUES (#{titulo}, #{descripcion})")
    public int insert(Post post);

    @Update("Update post set titulo=#{titulo}, " +
        " descripcion=#{descripcion} where idpost=#{idpost}")
    public int update(Post post);
}
