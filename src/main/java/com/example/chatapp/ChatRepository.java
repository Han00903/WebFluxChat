package com.example.chatapp;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

public interface ChatRepository extends ReactiveMongoRepository<Chat, String> {

    @Tailable // 커서를 안닫고 계속 유지함
    @Query("{sender: ?0, receiver: ?1}") // 몽고 db문법 확인
    Flux<Chat> mFindBySender(String sender, String receiver); // Flux: 흐름 (response를 유지하면서 데이터를 계혹 흘려보내기)

}
