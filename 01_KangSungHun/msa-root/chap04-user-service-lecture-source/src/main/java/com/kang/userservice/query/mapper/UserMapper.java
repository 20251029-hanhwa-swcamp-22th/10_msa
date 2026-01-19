package com.kang.userservice.query.mapper;

import com.kang.userservice.query.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO findUserById(Long userId);

    List<UserDTO> findAllUsers();
}
