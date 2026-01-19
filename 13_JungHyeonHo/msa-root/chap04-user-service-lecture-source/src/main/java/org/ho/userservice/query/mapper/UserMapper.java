package org.ho.userservice.query.mapper;

import org.ho.userservice.query.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO findUserById(Long userId);

    List<UserDTO> findAllUsers();
}
