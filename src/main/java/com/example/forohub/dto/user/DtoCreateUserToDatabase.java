package com.example.forohub.dto.user;

public record DtoCreateUserToDatabase (String username,
                                       String email,
                                       String passwordEncrypted,
                                       Profile typeOfProfile){
}
