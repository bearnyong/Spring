package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;

public interface BookDAO {
	
	List<BookDTO> selectBookList();
	
	BookDTO selectOneBook(int sequence);
}
