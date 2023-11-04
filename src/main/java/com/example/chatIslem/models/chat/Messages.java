package com.example.chatIslem.models.chat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.chatIslem.models.user.UserModel;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@Builder
@Document(collection="message")
public class Messages{

	@Id
	private String id;
	private String messageContent;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date DateEnvoie;
	private String convId;

	private UserModel sender;

	private List<UserModel> Recipients=new ArrayList<>();
    private Status status;

	public Messages() {
		this.id= UUID.randomUUID().toString();
	}
}