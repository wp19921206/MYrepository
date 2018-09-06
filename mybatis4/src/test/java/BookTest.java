

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.han.mybatis4.dao.IBookDao;
import com.han.mybatis4.vo.Book;

public class BookTest {
	
	SqlSession session = null;
	IBookDao bookDao = null;
	@Before
	public void before() throws IOException{
		String resource = "mybatis-config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		session = sqlSessionFactory.openSession(true);
		bookDao = session.getMapper(IBookDao.class);
	}

	
	@After
	public void after() throws IOException{
		session.close();
	}
	

	@Test
	public void testDeleteBook(){
		int c = bookDao.deleteBook(59L);
		System.out.println(c);
		
	}

	@Test
	public void testSelectCount(){
		int c = bookDao.getRowCount();
		System.out.println(c);
		Assert.assertNotEquals(0, c);
	}
	
	@Test
	public void testSelectName(){
		String name = bookDao.selectName(89L);
		System.out.println(name);
	}

	@Test
	public void testSelectBooks(){
		List<Book>  books = bookDao.selectBooks();
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
	@Test
	public void testSelectBooks2(){
		List<Book>  books = bookDao.selectBooks2();
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
	@Test
	public void testSelectBooks3(){
		List<Map<String, Object>>  books = bookDao.selectBooks3();
		
		for (Map book : books) {
			System.out.println(book);
		}
	}
	@Test
	public void  books(){
		List<Book> books = bookDao.books(1, 10);
		System.out.println(books);
	}



}
