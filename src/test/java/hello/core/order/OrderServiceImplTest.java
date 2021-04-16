package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        // 생성자 주입을 사용해야 순수한 자바 코드 테스트를 돌리기 쉬움
        // 생성자 주입만 필드에 final 키워드를 사용할 수 있음
        // 필드 주입은 스프링 컨테이너가 주입을 해줘야 하므로 순수 자바코드로 테스트가 어려움
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "iteamA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}