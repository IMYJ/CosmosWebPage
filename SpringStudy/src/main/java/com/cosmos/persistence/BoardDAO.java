package com.cosmos.persistence;
//MemberDAO 인터페이스
import com.cosmos.domain.BoardVO;

import java.util.List; 

public interface BoardDAO {
	
	  public void create(BoardVO vo) throws Exception;

	  public BoardVO read(Integer bno) throws Exception;

	  public void update(BoardVO vo) throws Exception;

	  public void delete(Integer bno) throws Exception;

	  public List<BoardVO> listAll() throws Exception;

	
	}

