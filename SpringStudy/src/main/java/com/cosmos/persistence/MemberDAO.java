package com.cosmos.persistence;
//MemberDAO �������̽�
import com.cosmos.lab.*;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
