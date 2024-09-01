package org.example.discount;

import org.example.member.Grade;
import org.example.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
class RateDiscountPolicyTest {

    RateDiscountPolicy test = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o(){
        //given
        Member member = new Member(1L,"VIP", Grade.VIP);
        //when
        int discount = test.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 적용이 안되어야 한다.")
    void vip_x(){
        //given
        Member member = new Member(1L,"Basic", Grade.BASIC);
        //when
        int discount = test.discount(member, 10000);
        //then

        assertThat(discount).isEqualTo(1000);
    }

 
}