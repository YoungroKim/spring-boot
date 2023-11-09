package net.youngro.apps.web.service;

import org.springframework.stereotype.Service;

/**
 * 정보 데이터를 처리하기 위한 서비스 클래스
 */
@Service
public class InfoService {
    /**
     * 정보를 리턴하는 메소드
     * 
     * @return 대상 정보
     */
    public String getInfo() {
        return "Youngro.NET Web Apps...";
    }

    /**
     * 버전 정보를 리턴함
     * 
     * @return 버전 정보
     */
    public String getVersion() {
        return "0.0.1";
    }

    /**
     * 저작권 문구를 리턴함
     * @return
     */
    public String getCopyright() {
        return "ⓒ 2023. Wish-Soft Inc. & Youngro.net all rights resvered.";
    }
}
