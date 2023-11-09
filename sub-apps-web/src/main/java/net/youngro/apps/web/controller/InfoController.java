package net.youngro.apps.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.youngro.apps.web.service.InfoService;

/**
 * 해당 앱의 정보 데이터를 처리하는 컨트롤러 클래스
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    /**
     * 정보 데이터 처리를 위한 서비스
     */
    private final InfoService infoService;

    /**
     * 기본 생성자
     * 
     * @param infoService 주입되는 InfoService
     */
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    /**
     * 정보 데이터를 리턴함
     * 
     * @return 정보 데이터
     */
    @GetMapping("/getInfo")
    public String getInfo() {
        return infoService.getInfo();
    }

    /**
     * 버전 데이터를 리턴함
     * 
     * @return 버전 데이터
     */
    @GetMapping("/getVersion")
    public String getVersion() {
        return infoService.getVersion();
    }

    /**
     * 저작권 표시 문구 정보를 리턴함
     * 
     * @return 저작권 표시 데이터
     */
    @GetMapping("/getCopyright")
    public String getCopyright() {
        return infoService.getCopyright();
    }
}
