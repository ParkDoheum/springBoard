package com.doheum.board;

public class BoardVO {
	private int i_board;
	private String t_title;
	private String t_content;
	private String r_datetime;
	private int cnt;
	private String ip_addr;
	
	public String getIp_addr() {
		return ip_addr;
	}
	public void setIp_addr(String ip_addr) {
		this.ip_addr = ip_addr;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getI_board() {
		return i_board;
	}
	public void setI_board(int i_board) {
		this.i_board = i_board;
	}
	public String getT_title() {
		return t_title;
	}
	public void setT_title(String t_title) {
		this.t_title = t_title;
	}
	public String getT_content() {
		return t_content;
	}
	public void setT_content(String t_content) {
		this.t_content = t_content;
	}
	public String getR_datetime() {
		return r_datetime;
	}
	public void setR_datetime(String r_datetime) {
		this.r_datetime = r_datetime;
	}
}
