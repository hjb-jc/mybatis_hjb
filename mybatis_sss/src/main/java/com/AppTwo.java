package com;

import com.nf2.sss.dao.CommentDao;
import com.nf2.sss.eneity.Author;
import com.nf2.sss.eneity.Blog;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class AppTwo {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatistwo-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        CommentDao mapper = session.getMapper(CommentDao.class);
       /* List<Author> authors = mapper.selectAll();
        authors.forEach(System.out::println);
*/

        /*System.out.println(mapper.updateblog("hen nies", 2));
        session.commit();*/

       /* Blog blog = new Blog();
        blog.setContent("醒醒吧,haizi!");
        blog.setId(1);
        System.out.println(mapper.updateblog2(blog));
        session.commit();*/

/*        Author author = new Author();
        author.setName("小霸王");
        author.setCity("珠海");
        System.out.println(mapper.insertAuthor(author));
        session.commit();*/

        //System.out.println(mapper.deleteAuthor("郭敬明"));

        List<Blog> blogs = mapper.selectBologs();
        blogs.forEach(System.out::println);


    }

}
