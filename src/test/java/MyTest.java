import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hzqstart
 * @create 2021-10-27-12:16
 */
public class MyTest {
    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books :bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
