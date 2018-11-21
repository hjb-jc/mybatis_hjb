package com.nf2.sss.dao;

import com.nf2.sss.eneity.Author;
import com.nf2.sss.eneity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    List<Author> selectAll();
    List<Blog> selectBols();
    List<Blog> selectBlogsNestedSelect();

    List<Blog> selectBologs();

    int updateblog(@Param("content") String content ,@Param("id") int id);
    int updateblog2(Blog blog);
    int insertAuthor(Author author);
    int deleteAuthor(String name);


}
