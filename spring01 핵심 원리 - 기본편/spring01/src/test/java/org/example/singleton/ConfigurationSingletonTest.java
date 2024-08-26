package org.example.singleton;

import org.example.AppConfig;
import org.example.member.MemberRepository;
import org.example.member.MemberServiceImpl;
import org.example.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest() {
            ApplicationContext ac = new
                    AnnotationConfigApplicationContext(AppConfig.class);
            MemberServiceImpl memberService = ac.getBean("memberService",
                    MemberServiceImpl.class);
            OrderServiceImpl orderService = ac.getBean("orderService",
                    OrderServiceImpl.class);
            MemberRepository memberRepository = ac.getBean("memberRepository",
                    MemberRepository.class);
//모두 같은 인스턴스를 참고하고 있다.
            System.out.println("memberService -> memberRepository = " +
                    memberService.getMemberRepository());
            System.out.println("orderService -> memberRepository  = " +
                    orderService.getMemberRepository());
            System.out.println("memberRepository = " + memberRepository);
//모두 같은 인스턴스를 참고하고 있다.
        }

    @Test
    void configurationTest2() {
        ApplicationContext ac = new
                AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);
        System.out.println("bean = " + bean);
    }
    }
