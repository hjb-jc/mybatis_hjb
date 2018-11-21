package com.nf2.sss.dao;

import com.nf2.sss.eneity.Author;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentImp {
    Author findById (int id);
    Author findByName(String name);
    List<Author> findNameAndCity(@Param("name") String name,@Param("city") String city);
    List<Author> findAll(RowBounds rowBounds);
    List<Author> findAllIdBiggerThan(int id, RowBounds rowBounds);
}
