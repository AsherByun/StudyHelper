package com.studyhelper.member.dao;

import org.springframework.data.repository.CrudRepository;

import com.studyhelper.member.dto.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
