package net.youngro.libs.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * REDIS 설정 관리를 위한 클래스
 */
@Configuration
@EnableRedisRepositories
public class RedisConfig {
    /**
     * Redis 호스트 주소
     */
    @Value("${spring.data.redis.host}")
    private String redisHost;

    /**
     * Redis 포트
     */
    @Value("${spring.data.redis.port}")
    private int redisPort;

    /**
     * Redis 비밀번호
     */
    @Value("${spring.data.redis.password:#{null}}")
    private String redisPassword;

    /**
     * REDIS 연결 정보 Bean 생성을 위한 Factory 메소드
     */
    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        // Redis 호스 주소 설정
        redisStandaloneConfiguration.setHostName(redisHost);
        // Redis 포트 설정
        redisStandaloneConfiguration.setPort(redisPort);
        // Redis Password 유무에 따른 패스워드 설정
        if (redisPassword != null && !redisPassword.isBlank())
            redisStandaloneConfiguration.setPassword(redisPassword);
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
        return lettuceConnectionFactory;
    }
}
