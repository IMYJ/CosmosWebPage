package com.cosmos.persistence;
//MemberDao 인터페이스를 구현하는 클래스

import java.util.List;
import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;//myBatis의 sqlsession은 insert,update,delete와 select기능 지원
import org.springframework.stereotype.Repository;
import com.cosmos.domain.BoardVO;


@Repository //DAO를 스프링에 인식시키기 위해서 사용
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;

		private static String namespace = "com.cosmos.mapper.BoardMapper";

		  @Override
		  public void create(BoardVO vo) throws Exception {
		    session.insert(namespace + ".create", vo);
		  }

		  @Override
		  public BoardVO read(Integer bno) throws Exception {
		    return session.selectOne(namespace + ".read", bno);
		  }

		  @Override
		  public void update(BoardVO vo) throws Exception {
		    session.update(namespace + ".update", vo);
		  }

		  @Override
		  public void delete(Integer bno) throws Exception {
		    session.delete(namespace + ".delete", bno);
		  }

		  @Override
		  public List<BoardVO> listAll() throws Exception {
		    return session.selectList(namespace + ".listAll");
		  }
}

