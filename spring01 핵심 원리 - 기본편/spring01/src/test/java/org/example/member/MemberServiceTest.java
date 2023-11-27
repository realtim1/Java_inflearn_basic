package org.example.member;

import org.example.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {


    MemberService memberService;

    @BeforeEach
    public  void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        System.out.println("beforeEach = " + "실행");
    }

    //MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        // given
        Member member = new Member(1L,"memberA",Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);





    }


}
