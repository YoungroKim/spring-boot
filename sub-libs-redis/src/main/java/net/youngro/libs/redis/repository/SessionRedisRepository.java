package net.youngro.libs.redis.repository;

import org.springframework.data.repository.CrudRepository;

import net.youngro.libs.redis.model.SessionData;

/**
 * SessionData 저장을 위한 REDIS 저장소 클래스
 */
public interface SessionRedisRepository extends CrudRepository<SessionData, Long> {

}