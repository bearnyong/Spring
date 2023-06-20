package com.greedy.section01.xmlconfig;

import com.greedy.section01.xmlconfig.MemberDTO;

public interface MemberDAO {
	
	MemberDTO selectMember(int sequence);
	
	boolean insertMember(MemberDTO member);

}
