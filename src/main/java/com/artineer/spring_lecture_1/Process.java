package com.artineer.spring_lecture_1;

import com.artineer.spring_lecture_1.component.AComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Process implements ApplicationRunner {
    AComponent aComponent;

    @Autowired
    public Process(AComponent aComponent) {
        this.aComponent = aComponent;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(aComponent);     // 동일한 인스턴스를 반환하는지 확인
    }
}
