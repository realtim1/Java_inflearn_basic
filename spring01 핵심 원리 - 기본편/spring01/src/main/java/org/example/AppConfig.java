package org.example;

import org.example.discount.DiscountPolicy;
import org.example.discount.RateDiscountPolicy;
import org.example.member.MemberRepository;
import org.example.member.MemberService;
import org.example.member.MemberServiceImpl;
import org.example.member.MemoryMemberRepository;
import org.example.order.OrderService;
import org.example.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//애플리케이션의 환경설정, 구성은 AppConfig 에서 해줘야한다.
    @Bean
    public MemberService memberService(){
        System.out.println(" call Appconfig memberService = " );
        return new MemberServiceImpl(memberRepository()); // 생성자 주입
    }

    @Bean
    public static MemberRepository memberRepository() {
        System.out.println(" call Appconfig memberRepository = " );
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        System.out.println(" call Appconfig orderService = " );
        return new  OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }



}
