package org.example.member;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import org.springframework.util.Assert;

public class MemberServiceTest {



    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        // given
        Member member = new Member(1L,"memberA",Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);





    }


}
