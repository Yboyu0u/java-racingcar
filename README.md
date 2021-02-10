# ✍ 문자열 덧셈 계산기

## 📌 프로그램 기능 목록

- `기능1` 빈 문자열 혹은 공백이 들어오는 경우 `0`을 반환
- `기능2` 구분자를 이용한 `split`

    - 기본으로 디폴트 구분자는 무조건 실행된다.
    - 디폴트 구분자를 사용함과 동시에 커스텀 구분자를 사용하는 경우도 발생할 수 있다.
    - 만약, 디폴트 구분자와 커스텀 구분자 외의 다른 구분자가 들어가게 되는 경우 👉 요소로 구분된 상태에서 문자로 인식되어 예외처리가 실행되어 걸러진다.

- `기능3` 잘못된 숫자 입력되는 경우

    - 분리된 요소가 문자이거나 숫자인 경우 `RuntimeException` 예외 처리
  
<br>

# 자동차 경주 구현

## 프로그램 기능 목록

- `기능1` 자동차 생성 기능

  - 자동차 이름 저장
  - 이름이 공백(" ")인 경우 자동으로 공백을 지울 수 있도록 처리
  - 이름 입력 예외 처리

    - 이름에 문자 외의 입력값이 들어가는 경우(ex. 특수문자) 예외 처리
    - 길이가 0 이하이거나 5 초과인 경우 예외 처리
    - 이름이 중복되는 경우 예외 처리
    - 자동차가 1대인 경우 경주를 시작할 수 없으므로 예외처리
  
  - 자동차 이동한 거리 정보 저장
  
    - 거리의 초기화 값은 0으로 생성한다.
  
- `기능2` 경주 기능 

  - `기능 2-1` 시도 횟수 설정 기능

    - 자연수 이외의 입력값이 들어가는 경우 예외처리

  - `기능 2-2` 전진 기능
  
    - 0에서 9사이의 랜덤값 생성 : Random Utils 활용
    - 랜덤값이 4 이상일 경우 전진, 3 이하일 경우 멈춤
  
  - `기능 2-3` 상태 출력 기능
  
- `기능3` 결과 공지 기능

  - 우승자 산출 기능

    - 우승자가 중복되는 경우 모두 출력

  - 우승자 출력 기능
  
  ## 🔧 프로젝트 수정 목록
  
  - `수정 1` StringCalculator 수정
  
    - 상수 처리 
    - Pattern 객체 재사용을 위한 리팩토링 
  
  - `수정 2` 유틸 패키지 수정
  
    - 상수 처리 
    - 적절한 접근제어자 설정
    - private 생성자 사용하여 인스턴스화 방지 
    - Pattern 객체 재사용을 위한 리팩토링
    
  - `수정 3` RuleStrategy 수정 
  
    - Car의 의미를 담도록 이름 변경 
    - 내부 상수 위치 재 설정
    
  - `수정 4` startRace() 메소드 리팩토링 
  
    - Car 객체 내부에 각자의 전략을 가지도록 리팩토링
    
  - `수정 5` RuleTest 클래스 대신 람다 함수 사용하여 Random 테스트 하도록 리팩토링 
    
    - Predicate 사용하지 않고 간소화 
    
  - `수정 6` MVC 패턴에 맞게 각 domain 영역에 알맞은 책임 부여
    
    - Car 클래스 세분화 
        
        - 코드 및 필드 간소화
        - Name 필드 불변객체로 래핑
        - Position 필드 불변객체로 래핑
  
  
      

<br>

# java-racingcar
자동차 경주 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)