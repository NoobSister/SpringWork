package jcpdev.day1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jcpdev.day1.dao.MemberDao;
import jcpdev.dto.Member;

@Component
public class MemberServiceMyImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	
	public MemberServiceMyImpl() { 		// 위의 필드 선언에 @Autowired 하려면 기본 생성자가 필요합니다.
	}

	public MemberServiceMyImpl(MemberDao dao) {
		System.out.println("MemberServiceMyImpl create.///////////////////");
		this.dao = dao;
	}

	public Member findMember(int idx) {
		
		System.out.println("MemberServiceMyImpl findMember()///////////////////");
		return dao.findMember(idx);
	}

}
