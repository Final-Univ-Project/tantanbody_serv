package com.app.tantanbody.mapper;

import com.app.tantanbody.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<Map<String, Object>> getUserList();

    int selectUser(UserDto userDto);

    void insertUserData(UserDto userDto);

}
