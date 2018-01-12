package com.cosmos.persistence;
//MemberDao 인터페이스를 구현하는 클래스

import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;//myBatis의 sqlsession은 insert,update,delete와 select기능 지원
import org.springframework.stereotype.Repository;
import com.cosmos.lab.*;


@Repository //DAO를 스프링에 인식시키기 위해서 사용
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;

		private static final String namespace = "com.cosmos.mapper.MemberMapper";

	@Override

	public String getTime() {

		// TODO Auto-generated method stub

		return sqlSession.selectOne(namespace+".getTime");

	}



	@Override

	public void insertMember(MemberVO vo) {

		// TODO Auto-generated method stub

		sqlSession.insert(namespace+".insertMember", vo);

	}

	

}
