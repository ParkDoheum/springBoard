package com.doheum.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("list.do")	
	public String boardList(Model model) {		
		model.addAttribute("list", service.getBoardList());
		return "list";
	}
	
	@RequestMapping("write.do")
	public String writeGet(Model model, BoardVO vo) {
		model.addAttribute("action", "write.do");
		model.addAttribute("detail", vo);		
		return "write";
	}

	@RequestMapping("mod.do")
	public String modGet(Model model, @RequestParam int i_board) {
		BoardVO vo = service.detailGet(i_board);
		model.addAttribute("detail", vo);
		model.addAttribute("action", "mod.do");
		return "write";
	}
	
	@RequestMapping(value="write.do", method=RequestMethod.POST)
	public String writePost(BoardVO vo) {
		System.out.println("t_title : " + vo.getT_title());
		System.out.println("t_content : " + vo.getT_content());		
		service.insertBoard(vo);		
		return "redirect:detail.do?i_board=" + vo.getI_board();
	}
	
	@RequestMapping(value="mod.do", method=RequestMethod.POST)
	public String modPost(BoardVO vo) {
		
		service.updateBoard(vo);	
		
		return "redirect:detail.do?i_board=" + vo.getI_board();
	}
	
	@RequestMapping("detail.do") 
	public String detailGet(Model model
			, @RequestParam int i_board) {
		
		System.out.println("i_board : " + i_board);
		
		BoardVO vo = service.detailGet(i_board);
		System.out.println("vo - content : " + vo.getT_content());
		
		model.addAttribute("detail", vo);
		
		return "detail";
	}
}




