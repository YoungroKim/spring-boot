package net.youngro.apps.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 메세지 데이터 처리를 위한 클래스
 */
public class MessageData {
    /**
     * 메세지 데이터 요청을 위한 Request DTO Class
     */
    @Data
    public static class MessageRequestData {
        /**
         * 대상의 아이디 값
         */
        @JsonProperty("id")
        private Long id;
    }
}
