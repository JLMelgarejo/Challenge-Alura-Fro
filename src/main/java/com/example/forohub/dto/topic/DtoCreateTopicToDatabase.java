package com.example.forohub.dto.topic;

public record DtoCreateTopicToDatabase (
        String title,
        String message,
        User user,
        Course course,
        Status status
)
{
}
