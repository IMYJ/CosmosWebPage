package com.cosmos.persistence;
//MemberDao �������̽��� �����ϴ� Ŭ����

import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;//myBatis�� sqlsession�� insert,update,delete�� select��� ����
import org.springframework.stereotype.Repository;
import com.cosmos.lab.*;


@Repository //DAO�� �������� �νĽ�Ű�� ���ؼ� ���
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
