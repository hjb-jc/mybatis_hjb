import com.nf2.sss.dao.CommentImp;
import com.nf2.sss.eneity.Author;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        //Object o = session.selectOne("findById", 4);
        //Object o = session.selectOne("findByName", "鲁%");
       /* HashMap<String, String> o = new HashMap<>();
        o.put("name","鲁迅");
        o.put("city","北京");
        session.selectOne("findNameAndCity",o);*/

        /*Cursor<Object> findAll = session.selectCursor("findAll");
        Iterator<Object> iterator = findAll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*session.select("findAll", new ResultHandler() {
            @Override
            public void handleResult(ResultContext resultContext){
                if(resultContext.getResultCount() % 2 == 0)
                    System.out.println(">>>"+ resultContext.getResultCount() + ":" + resultContext.getResultObject());
            }
        });*/

        Map<Object, Object> objectObjectMap = session.selectMap("findAll",null,"name",new RowBounds(1,2));
        System.out.println(objectObjectMap);
        System.out.println(objectObjectMap.get("毛泽东"));

        //CommentImp mapper = session.getMapper(CommentImp.class);
        /*List<Author> all = mapper.findAll(new RowBounds(2, 3));
        all.forEach(System.out::println);*/

 /*       List<Author> allIdBiggerThan = mapper.findAllIdBiggerThan(1, new RowBounds(3,4));
        allIdBiggerThan.forEach(System.out::println);*/
    }
}
