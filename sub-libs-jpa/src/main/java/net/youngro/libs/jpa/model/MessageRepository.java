package net.youngro.libs.jpa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 메세지 데이터 처리를 위한 JPA 저장소 인터페이스
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
