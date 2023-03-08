package com.learning.taskboard.objects.response;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> {
    Integer code;
    T data;
    LocalDate timeStamp;
    String message;

    // Use object.<Type>builder for generic builders
    public static <T> Response<T> success(T data) {
        return Response.<T>builder()
                .code(HttpStatus.OK.value())
                .data(data)
                .message("success")
                .timeStamp(LocalDate.now())
                .build();
    }

    public static <T> Response<T> failure(T data, HttpStatus httpStatus) {
        return Response.<T>builder()
                .code(httpStatus.value())
                .data(data)
                .message("failure")
                .timeStamp(LocalDate.now())
                .build();
    }
}