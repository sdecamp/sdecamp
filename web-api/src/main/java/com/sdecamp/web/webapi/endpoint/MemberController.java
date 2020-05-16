package com.sdecamp.web.webapi.endpoint;

import com.sdecamp.web.webapi.common.MemberRepository;
import com.sdecamp.web.webapi.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping(value = "/members")
    public Iterable<Member> getAll(){
        return memberRepository.findAll();
    }
}
