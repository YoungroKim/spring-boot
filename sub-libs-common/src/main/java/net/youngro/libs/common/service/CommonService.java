package net.youngro.libs.common.service;

import org.springframework.stereotype.Service;

/**
 * 공통 기능을 수행하는 서비스 클래스
 */
@Service
public class CommonService {
    /**
     * 서비스 정보 문자열을 리턴함
     * @return
     */
    public String getInfo() {
        return "Youngro.net - Common Service";
    }    
}
