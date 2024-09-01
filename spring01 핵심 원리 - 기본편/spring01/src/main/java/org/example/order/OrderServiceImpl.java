package org.example.order;

import org.example.discount.DiscountPolicy;
import org.example.member.Member;
import org.example.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository; // 변경 , final로 되어있으면 기본으로 할당되는 생성자를 통해 할당되어야한다.
    private final DiscountPolicy discountPolicy; // 변경

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);


        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
    //ㅌㅔ스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
