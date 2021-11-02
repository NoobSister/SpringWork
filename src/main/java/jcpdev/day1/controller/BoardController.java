package jcpdev.day1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jcpdev.day1.service.BoardService;

@Component		// -> bean 생성된다.
public class BoardController {  //웹애플리케이션에서 클라이언트 요청 처리
	@Autowired		// BoardService 타입의 빈을 주입한다.
	private BoardService service; 	// 의존관계
	
	public void setService(BoardService service) {	// 의존관계 주입 방법1 : setter
		this.service = service;
	}
	
	// 의존관계 주입 방법2 : 생성자
	
	public void dataRead() {
		System.out.println("controller dataRead()------");
		service.dataRead();
	}

}

// @Autowired는 필드, 생성자, 메소드에서 의존관계를 주입할 수 있다.
// @Conponent로 bean을 생성할 때에는 사용할 때에는 기본 생성자 -> 커스텀 생성자 순서로 생성한다.
// -> 이 때 @Autowired를 만나면 해당 빈을 먼저 생성하여 주입한다.
