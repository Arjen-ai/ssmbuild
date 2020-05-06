import edu.xalead.pojo.Books;
import edu.xalead.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = applicationContext.getBean("bookServiceImpl", BookService.class);
        List<Books> booksList = service.queryAllBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }
}
