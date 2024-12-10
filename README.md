# WebFluxChat
비동기 서버 Netty와 NoSQL MongoDB를 이용한 채팅 서버 

# 채팅 API POST 요청
-> POST 요청을 사용하여 http://localhost:8080/chat 엔드포인트로 메시지 데이터를 전송<br>
-> sender, receiver, msg를 포함하는 JSON 객체를 본문에 담아 요청을 보냄
### 요청
#### URL: http://localhost:8080/chat
#### 메서드: POST
#### 본문 (원시 JSON):
      {
        "sender": "ssar",
        "receiver": "cos",
        "msg": "심심니"
      }

### Postman을 사용하여 POST 요청 전송 예시
### ![image](https://github.com/user-attachments/assets/cf81a833-cca6-4642-9f17-c99b2049468d)

### 응답
#### 서버는 요청이 성공적으로 처리되면 JSON 응답을 반환
      {
        "id": "67586af621a90a425f53bb1b",
        "msg": "심심니",
        "sender": "ssar",
        "receiver": "cos",
        "createdAt": "2024-12-11T01:23:18.1150052"
      }
