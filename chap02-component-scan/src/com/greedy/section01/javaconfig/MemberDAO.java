package com.greedy.section01.javaconfig;

import com.greedy.section01.javaconfig.MemberDTO;

public interface MemberDAO {
	
	MemberDTO selectMember(int sequence);
	
	boolean insertMember(MemberDTO member);

}
