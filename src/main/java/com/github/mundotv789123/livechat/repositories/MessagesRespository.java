package com.github.mundotv789123.livechat.repositories;

import com.github.mundotv789123.livechat.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessagesRespository extends PagingAndSortingRepository<Message, Integer>, CrudRepository<Message, Integer> {

}
