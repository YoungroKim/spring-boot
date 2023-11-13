package net.youngro.libs.redis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * REDIS에 저장될 Session 데이터 클래스
 */
@RedisHash("session")
public class SessionData {
    /**
     * 데이터 아이디
     */
    @Id
    private Long id;
}
