package com.korea.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//클라이언트와 주고받을 때(요청, 응답) DTO에 담아서 주자고 약속
//데이터가 계층간 이동할 때 controller -> service -> repository 이럴 때는 Entity에 담아서 옮김

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private String token;
	private String username;
	private String password;
	private String id;
}
	

