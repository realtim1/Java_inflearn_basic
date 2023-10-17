package org.example;

import org.example.member.Grade;
import org.example.member.Member;
import org.example.member.MemberService;
import org.example.member.MemberServiceImpl;

import java.awt.*;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L,"memberA",Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }

}
