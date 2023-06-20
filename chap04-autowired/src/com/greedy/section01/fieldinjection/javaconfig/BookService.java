package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	
	/* BookDAO 타입의 빈으로 생성된 객체를 이 포로퍼티에 자동으로 연결해준다.
	 * 간단하긴 하지만 필드 주입은 최대한 사용을 지양하는 것이 좋다.*/
	
	@Autowired
	private BookDAO bookDAO;
	
	public BookService(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public List<BookDTO> selectAllBooks(){
		return bookDAO.selectBookList();
	}
	
	public BookDTO searchBookBySequence(int sequence) {
		return bookDAO.selectOneBook(sequence);
	}
	
}
