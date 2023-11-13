package net.youngro.libs.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 메세지 데이터 처리를 위한 Entity 클래스
 */
@Entity
@Data
@Table(name = "MESSAGE")
public class Message {
    /**
     * 아이디
     */
    @Id
    private Long id;

    /**
     * 대상 메세지의 토픽 정보
     */
    @Column(name = "TOPIC", columnDefinition = "VARCHAR(50)")
    private String topic;

    /**
     * 메세지 제목
     */
    @Column(name = "TITLE", columnDefinition = "VARCHAR(100)")
    private String title;

    /**
     * 메세지 내용
     */
    @Column(name = "CONTENT", columnDefinition = "VARCHAR(2000)")
    private String content;

    /**
     * 기타 설명
     */
    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR(2000)")
    private String description;
}
