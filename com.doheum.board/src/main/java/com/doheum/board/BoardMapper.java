package com.doheum.board;

import java.util.List;

public interface BoardMapper {
	public List<BoardVO> getBoardList();
	public BoardVO getBoardDetail(BoardVO p);
		
	public void insertBoard(BoardVO vo);
	public void updBoardCnt(BoardVO p);
	
}
