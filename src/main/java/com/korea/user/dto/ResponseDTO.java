package com.korea.user.dto;

import java.util.List;

import com.korea.user.model.UserEntity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseDTO<T> {
	private String error;
	private List<T> data;
}
