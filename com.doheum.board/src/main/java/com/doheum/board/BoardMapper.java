package com.doheum.board;

import java.util.List;

public interface BoardMapper {
	public List<BoardVO> getBoardList();
	public BoardVO getBoardDetail(BoardVO p);

	public Integer getPrevIboard(BoardVO p);
	public Integer getNextIboard(BoardVO p);
	
	public int getBoardPk();
	public void insertBoard(BoardVO vo);
	public void updBoardSeq(BoardVO vo);
	
	public void updBoardCnt(BoardVO p);
	public void updateBoard(BoardVO p);
}
