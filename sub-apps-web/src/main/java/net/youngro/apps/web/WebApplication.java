package net.youngro.apps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 웹 어플리케이션 시작 클래스
 */
@SpringBootApplication
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
