package com.app.tantanbody.service;

import com.app.tantanbody.dto.UserDto;
import com.app.tantanbody.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<Map<String, Object>> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int searchUser(UserDto userDto) {
        return userMapper.selectUser(userDto);
    }

    @Override
    public void saveUserData(UserDto userDto) {
        userMapper.insertUserData(userDto);
    }

}
