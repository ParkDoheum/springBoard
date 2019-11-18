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
		mapper.insertBoard(vo);
	}
}
