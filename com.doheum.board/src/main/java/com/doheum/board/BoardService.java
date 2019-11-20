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
	
	public BoardDetailDomain detailGet(int i_board) {		
		 HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
	     String ip = req.getHeader("X-FORWARDED-FOR");
	      if (ip == null) {
	            ip = req.getRemoteAddr();
	      }
	      BoardVO param = new BoardVO();
	      param.setI_board(i_board);
	      param.setIp_addr(ip);
		
		mapper.updBoardCnt(param);
		BoardVO resultVO =  mapper.getBoardDetail(param);
		
		BoardDetailDomain returnVO = new BoardDetailDomain();
		returnVO.setVo(resultVO);
		
		//이전글 i_board값 가져오기
		int prevIboard = mapper.getPrevIboard(param);
		returnVO.setPrevIboard(prevIboard);
		
		//다음글 i_board값 가져오기
		int nextIboard = mapper.getNextIboard(param);
		returnVO.setNextIboard(nextIboard);
				
		return returnVO;
	}
	
	public void insertBoard(BoardVO vo) {
		
		int i_board = mapper.getBoardPk();
		
		if(vo.getGrp() == 0) { //본글
			vo.setI_board(i_board);
			vo.setGrp(i_board);
			
		} else { //답글		
			vo.setI_board(i_board);
			vo.setSeq(vo.getSeq() + 1);
			vo.setFloor(vo.getFloor() + 1);
			
			System.out.println("vo.getSeq() : " + vo.getSeq());
			mapper.updBoardSeq(vo);
		}
		
		mapper.insertBoard(vo);
		
	}
	
	public void updateBoard(BoardVO vo) {
		mapper.updateBoard(vo);
	}
}
