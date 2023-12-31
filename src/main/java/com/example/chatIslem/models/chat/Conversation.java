package com.example.chatIslem.models.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.chatIslem.models.user.UserModel;
import com.example.chatIslem.utils.TokenUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "conversation")
public class Conversation {

    @Id
    private String id;

    private String chatName;

    @DBRef
    private List<UserModel> participants = new ArrayList<>();
    @DBRef
    public List<Messages> message = new ArrayList<>();

}
