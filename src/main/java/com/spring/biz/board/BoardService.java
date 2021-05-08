package com.spring.biz.board;

import java.util.List;

public interface BoardService {

	//CRUD ����� �޼ҵ� ����
	//�۵��
	void insertBoard(BoardVO vo);

	//�ۼ���
	void updateBoard(BoardVO vo);

	//�� ����
	void deleteBoard(BoardVO vo);

	//�� �� ��ȸ
	BoardVO getBoard(BoardVO vo);

	//�� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}