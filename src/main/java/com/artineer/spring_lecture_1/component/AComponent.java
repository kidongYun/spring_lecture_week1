package com.artineer.spring_lecture_1.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AComponent {
    // AComponent 가 가진 3개의 의존성
    BComponent bComponent;
    CComponent cComponent;
    DComponent dComponent;

    // 생성자 주입으로 의존성 주입을 하고 있다.
    @Autowired
    public AComponent(BComponent bComponent, CComponent cComponent, DComponent dComponent) {
        this.bComponent = bComponent;
        this.cComponent = cComponent;
        this.dComponent = dComponent;
    }
}
