package com.springboot.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    //@RequestBody를 활용한 PUT 메서드 구현
    //POST 메서드와 마찬가지로 값을 HTTP Body에 담아 전달함.

    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    //DTO 객체를 활용한 PUT 메서드 구현
    //postPutDto1은 리턴 값이 String 타입이고,
    @PutMapping(value = "/member1")
    public String postMemberDto1(@RequestBody MemberDto PutDto) {
        return PutDto.toString();
    }
    //postPutDto2는 DTO 객체 타입임.
    @PutMapping(value = "/member2")
    public MemberDto postMemberDto2(@RequestBody MemberDto PutDto){
        return PutDto;
    }
    //요청을 보내면 String 타입으로 값을 전달받게 되며, 리턴 값으로 설정한 DTO 객체의 toString 메서드 결과값이 출력.

    //HttpEntity 클래스
    //HttpEntity는 다음과 같이 헤어(Header)와 Body로 구성된 HTTP 요청과 응답을 구성하는 역할을 수행함.
    //RequestEntity 와 ResponseEntity는 HttpEntity를 상속받아 구현한 클래스입니다
    //Res..Entity는 서버에 들어온 요청에 대해 응답 데이터를 구성해 전달할 수 있게함. HEntity로부터 HHeader와 body를 가지고 자체적 hstatus 구현

    public class CustomHttpEntity <T> {
        private final HttpHeaders headers;

        @Nullable
        private final T body;
        public CustomHttpEntity(HttpHeaders headers, @Nullable T body) {
            this.headers = headers;
            this.body = body;
        }
    }

    //ResponseEntity 클래스
    public static class ResponseEntity<T> extends HttpEntity<T> {
        private static HttpStatus status = null;

        public ResponseEntity(HttpStatus status, HttpHeaders headers, @Nullable T body) {
            //super(headers, body);
            ResponseEntity.status = status;
        }

        public static HttpResponse<Object> status(HttpStatus httpStatus) {
            return null;
        }

        public HttpStatus getStatus() {
            return status;
        }
    }

    //ResponseEntity를 활용한 PUT 메서드 구현
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> postPutDto3(@RequestBody MemberDto PutDto){
        return (ResponseEntity<MemberDto>) (ResponseEntity<MemberDto>) ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body();
    }

}
