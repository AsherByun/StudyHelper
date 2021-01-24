package com.studyhelper.member;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.studyhelper.member.dao.MemberRepository;
import com.studyhelper.member.dto.Member;
import com.studyhelper.properties.Gender;
import com.studyhelper.properties.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class MemberTest {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private PasswordEncoder encoder;
	
//	@Test
//	public void 맴버삽입테스트() {
//		Member member = new Member();
//		member.setAge(27);
//		member.setId("dfdo333");
//		member.setGender(Gender.MAN);
//		member.setPassword(encoder.encode("1234"));
//		member.setNickName("hohoho");
//		member.setRole(Role.ROLE_ADMIN);
//		memberRepository.save(member);
//	}
}
