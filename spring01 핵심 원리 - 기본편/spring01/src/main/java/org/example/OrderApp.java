package org.example;

import org.example.member.Grade;
import org.example.member.Member;
import org.example.member.MemberService;
import org.example.member.MemberServiceImpl;
import org.example.order.Order;
import org.example.order.OrderService;
import org.example.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);


        Order order = orderService.createOrder(memberId,"itemA", 10000);


        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());

    }
}
