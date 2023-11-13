package net.youngro.apps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 웹 어플리케이션 시작 클래스
 */
@SpringBootApplication
// Sub Project의 Component 스캔을 위한 명시적 스캔
@ComponentScan({
	"net.youngro.apps",
	"net.youngro.libs"})
// Sub Project의 Entity 스캔을 위한 명시적 스캔
@EntityScan({
	"net.youngro.libs.jpa"
})
// Sub Project의 Repository 스캔을 위한 명시적 스캔
@EnableJpaRepositories("net.youngro.libs.jpa")
public class WebApplication {
	/**
	 * 어플리케이션 시작 진입 메소드
	 * 
	 * @param args 인자
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
