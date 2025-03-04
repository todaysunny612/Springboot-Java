package com.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; //URL 요청을 특성 메서드나 클래스와 연결
import org.springframework.web.bind.annotation.RequestMethod; //어떤 http 요청 방식(get, post)을 처리할지 지정함
import org.springframework.web.bind.annotation.RestController; //클래스가 rest api 요청을 처리하는 컨트롤러임을 명시
import org.springframework.web.bind.annotation.PathVariable; //변수이름 특정 가능한 value 요소 존재. 이 위치에 변수 이름을 정의하면 매개변수와 매핑 가능
import org.springframework.web.bind.annotation.RequestParam; //경로에 값을 담아 요청

import java.util.Map;

@RestController //컨트롤러의 클래스임을 명시하기 위해 추가함
@RequestMapping("/api/v1/hs/get-api") //주소 http://localhost:8080/api/v1/hs/get-api
public class GetController {
    //http://locahost:8081/api/v1/hs/get-api/hello
    //메서드에 @RequestMapping 어노테이션을 붙여서 특정 URL과 연결
    @RequestMapping(value = "/hello", method = RequestMethod.GET) //이 메서드는 GET요청(브라우저 주소창 입력이나 클릭)에만 반응하도록 지
    public String gethello() {
        return "GET API";
    }

    //매개변수가 없는 GET 메서드 구현
    //매개변수가 없는 GET 메서드라는 것은, 클라이언트가 서버로 요청을 보낼 때 추가 데이터를 전달하지 않는 GET요청을 의미
    //단순히 경로 (/name)로 요청을 보내기만 하면 응답을 받는 메서드
    @GetMapping(value = "/name")
    public String getName() {
        return "Flature"; //요청을 받으면 바로 Flature 출력
    }

    //@PathVariable을 활용한 GET 메서드 구현
    //http://localhost:8081/api/v1/hs/get-api/variable1/{Sring값}
    //중괄호({})로 표시된 **위치**의 값을 받아 요청하는 것. 실제 요청시 중괄호는 들어가지 않으며 값만 존재.
    //값을 간단히 전달할 때 주로 사용/
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    //@PathVariable에 변수명을 매핑하는 방법
    //1번줄에 적힌 변수명 variable과 2번줄 매개변수 var가 일치하지 않을 때 두 값을 매핑하는 방법을 보여줌.
    @GetMapping(value = "variable2/{variable}") //1
    public String getVariable2(@PathVariable("variable") String var) { //2 //variable 경로 변수의 값을 받아 var라느 변수에 저장
        //variable2/abc 라면 bc가 var에 할당
        return var;
    }

    //@RequestParam을 활용한 GET 메서드 구현
    @GetMapping(value = "request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
        //http://localhost:8081/api/v1/hs/get-api/request1?name=value1&email=value2&organization=value3
    }

    //@RequestParam 과 Map을 조합한 GET 메서드 구현
    //쿼리스트링에 어떤 값이 들어올지 모른다면 Map 객체 활용
    @GetMapping(value = "request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) { //key와 value 형태로 저장
        StringBuilder sb = new StringBuilder(); //StringBuilder 객체를 사용하여 문자열 효율적 생성
        param.entrySet().forEach(map ->{ //param.entrySet()은 맵의 모든 엔트리(키-값)을 반환
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString(); //StringBuilder에 저자된 문자열을 toString() 메서드 사용해 반환.
        //http://localhost:8081/api/v1/hs/get-api/request2?key1=value1&key2=value2
    }
    //DTO 객체 활용 GET 메서드 구현
    @GetMapping(value = "request3")
    public String getRequestParam3(MemberDto memberDto){
        //return memberDto.getName() + "," + memberDto.getEmail() + "," + memberDto.getOrganization();
        return memberDto.toString();
    }
}
