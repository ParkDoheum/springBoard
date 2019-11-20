package com.doheum.board;

public class BoardDetailDomain {
	private BoardVO vo;
	private int prevIboard;
	private int nextIboard;
	
	public BoardVO getVo() {
		return vo;
	}
	public void setVo(BoardVO vo) {
		this.vo = vo;
	}
	public int getPrevIboard() {
		return prevIboard;
	}
	public void setPrevIboard(int prevIboard) {
		this.prevIboard = prevIboard;
	}
	public int getNextIboard() {
		return nextIboard;
	}
	public void setNextIboard(int nextIboard) {
		this.nextIboard = nextIboard;
	}	
}
