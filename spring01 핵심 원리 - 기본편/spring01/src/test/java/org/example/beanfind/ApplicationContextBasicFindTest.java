package org.example.beanfind;

import org.example.member.MemberService;
import org.example.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.AppConfig;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBaenByName() {

        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }

    @Test
    @DisplayName("이름 없이 타입으로 조회 조회")
    void findBaenByType() {

        MemberService memberService = ac.getBean( MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }


    @Test
    @DisplayName("빈 이름으로 조회2")
    void findBaenByName2() {

        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
    @Test
    @DisplayName("빈 이름으로 조회 X")
    void findBeanByNameX() {
        // ac.getBean("xxxx", MemberService.class);
       // MemberService xxxx = ac.getBean("xxxx", MemberService.class);
        //assertThrows(NoSuchBeanDefinitionException.class,
        //        () - ac.getBean("xxxx", MemberService.class));
    }


}
