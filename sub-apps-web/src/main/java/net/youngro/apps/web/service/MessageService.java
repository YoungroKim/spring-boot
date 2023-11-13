package net.youngro.apps.web.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import net.youngro.libs.jpa.model.Message;
import net.youngro.libs.jpa.model.MessageRepository;

/**
 * 메세지 처리를 위한 서비스 클래스
 */
@Service
public class MessageService {
    /**
     * 메세지 데이터 처리를 위한 저장소 클래스
     */
    private final MessageRepository messageRepository;

    /**
     * 기본 생성자 (주입)
     * 
     * @param messageRepository 주입되는 메세지 데이터 처리를 위한 저장소
     */
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /**
     * 모든 메세지 데이터를 가져옴
     * 
     * @return 메세지 데이터 리스트
     */
    public List<Message> getMessageList() {
        return messageRepository.findAll();
    }

    /**
     * 메세지 데이터를 가져옴
     * 
     * @param id 대상 메세지 아읻
     * @return 찾은 결과 값
     * @throws NoSuchElementException 해당 아이디 값을 가지는 메세지가 존재하지 않을 경우 발생
     */
    public Message getMessage(Long id) {
        return messageRepository.findById(id).orElseThrow(() -> new NoSuchElementException("찾는 메세지가 존재하지 않음"));
    }
}
