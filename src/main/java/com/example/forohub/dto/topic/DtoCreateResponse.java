package com.example.forohub.dto.topic;

public record DtoCreateResponse (
        String message,
        int idTopic,
        int idAuthor,
        String solution
)
{
}
