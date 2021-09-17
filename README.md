# 1주차 강의 노트

## 왜 스프링을 배울까?

1. 기업 수준에서 필요한 기능들을 상당 부분 제공
    - 의존성 관리
      - Spring Core
    - API
      - Spring Web MVC
    - 영속화
      - Spring Data
    - 테스트
      - Spring Test
    - 뷰
      - Spring Thymeleaf
    - 보안/인증/권한
      - Spring Security
    - MSA
      - Spring Cloud
    - 비동기
      - Spring Webflux
      

2. 2004년 3월 24일 출시되어 약 20년 간 스프링 프레임워크는 사용되고 있다.
   - 안정적임이 보증되고, 획일화된 개발 방법
   - 초기설정이 어려웠으나 2014년 4월 1일에 스프링 부트 출시로 해결
   

3. 많은 기업들에서 스프링을 사용하고 있음
   - 구직자에게 가장 중요한 포인트가 아닐까?

## 스프링 프레임워크 vs 스프링 부트

- 자동설정 기능
- ...

## Intellij Community

- Toolbox 설치
  https://www.jetbrains.com/ko-kr/toolbox-app/

- Toolbox 를 통해 Intellij Community 설치

## start.spring.io 에서 스프링 부트 프로젝트 생성

- 접속 https://start.spring.io/


- 프로젝트 생성
    - Project : Gradle
    - Language : Java
    - Spring Boot : 2.5.4
    - Packaging : Jar
    - Java : 11
    - No dependency


- 압축파일 다운받아서 본인이 원하는 곳에 압축 풀기 (이곳이 작업폴더가 됨)

## intellij IDE 에서 open

- File > Open > 작업폴더


- Trust Project

## 스프링 부트 프로젝트 실행해보기


- Application.java 파일을 찾아서 에디터 옆쪽의 초록색 삼각형 선택하고 실행.


## 스프링 웹 의존성 추가하기

- implementation 'org.springframework.boot:spring-boot-starter-web'


## 의존성 관리가 필요한 이유

- 의존하는게 있는 객체를 만들 때에 의존하는 객체들 까지 모두 고려해야하는 상황이 발생.


- 소스의 중복이 발생


- 메모리를 효과적으로 사용하기가 보다 어려워짐 (싱글톤 패턴을 직접 구현해야함)


## 프로세스 만들 때 ApplicationRunner

- 스프링 부트에서 제공하는 객체

- 스프링 프로젝트가 처음 시작할 때에 대한 Hook 을 제공


## 스프링에서 제공하는 의존성 관리

- @Bean (@Component 와 역할이 동일)
    - 스프링 컨테이너에 등록된 객체
  
- @Component
    - 이 클래스를 스프링 컨테이너에 등록

- @Autowired
    - 스프링 컨테이너에 등록된 객체를 주입


## 필드주입, 생성자주입, setter주입과 순환참조 이슈

- 필드주입, 생성자주입, Setter주입

- 순환참조 이슈로 생성자 주입을 추천한다

- 순환참조 이슈

## 과제

- 개발환경 구축

- 동일한 스프링 프로젝트 구현

- 본인 Git Repository 에 해당 소스 push.

## 강의 링크

- https://www.youtube.com/watch?v=cmdaq6qD_Gw