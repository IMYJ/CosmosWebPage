package com.cosmos.persistence;
//MemberDAO 인터페이스
import com.cosmos.lab.*;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
