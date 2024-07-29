package com.trickynguci.civicmessagerbackend.dto.request;

import com.trickynguci.civicmessagerbackend.enums.MediaType;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MessageRequest {
    private int senderId;
    private int receiverId;
    private String content;
    private String status;
    private MediaType mediaType;
    private String mediaUrl;
    private Timestamp timestamp;
}
