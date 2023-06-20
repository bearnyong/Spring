package com.greedy.section01.fieldinjection.javaconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("BookDAO")
public class BookDAOImpl implements BookDAO {
	
	private Map<Integer, BookDTO> bookList;
	
	public BookDAOImpl() {
		bookList = new HashMap();
		bookList.put(1,  new BookDTO(1, 1234, "자바의 정석", "남궁성", "도우출판", new java.util.Date()));
		bookList.put(2,  new BookDTO(2, 121334, "안녕 정석", "나는야", "ㄴㅇ출판", new java.util.Date()));
		bookList.put(3,  new BookDTO(3, 121331434, "오징어 정석", "화장실", "ㅇㅇ출판", new java.util.Date()));
	}

	@Override
	public List<BookDTO> selectBookList() {
		// TODO Auto-generated method stub
		return new ArrayList<BookDTO>(bookList.values());
	}

	@Override
	public BookDTO selectOneBook(int sequence) {
		return bookList.get(sequence);
	}
	
}
