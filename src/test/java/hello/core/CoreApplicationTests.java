package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {

	@Autowired MemberRepository memberRepository;
	@Autowired OrderService orderService;
	@Autowired MemberService memberService;
	@Test
	void contextLoads() {
		System.out.println("memberRepository = " + memberRepository);
		System.out.println("orderService = " + orderService);
		System.out.println("memberService = " + memberService);
	}

}
