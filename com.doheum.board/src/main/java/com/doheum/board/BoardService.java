package com.doheum.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}
	
	public BoardVO detailGet(int i_board) {		
		 HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
	     String ip = req.getHeader("X-FORWARDED-FOR");
	      if (ip == null) {
	            ip = req.getRemoteAddr();
	      }
	      BoardVO param = new BoardVO();
	      param.setI_board(i_board);
	      param.setIp_addr(ip);
		
		mapper.updBoardCnt(param);
		return mapper.getBoardDetail(param);
	}
	
	public void insertBoard(BoardVO vo) {
		
		int i_board = mapper.getBoardPk();
		
		if(vo.getI_board() == 0) { //본글
			vo.setI_board(i_board);
			vo.setGrp(i_board);
			
		} else { //답글
			
		}
		
		mapper.insertBoard(vo);
		
	}
	
	public void updateBoard(BoardVO vo) {
		mapper.updateBoard(vo);
	}
}
