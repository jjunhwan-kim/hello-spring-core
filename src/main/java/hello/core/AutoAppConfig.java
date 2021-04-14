package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages 또는 basePackageClasses 를 지정하지 않으면 @ConponentScan 이 붙은 설정 정보 클래스의 패키지가 시작위치가 됨
//        basePackages = "hello.core.member",
//        basePackageClasses = AutoAppConfig.class,

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
