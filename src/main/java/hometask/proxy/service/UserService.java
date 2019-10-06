package hometask.proxy.service;

import hometask.proxy.domain.User;

public interface UserService {
    User findById(Long id);
}
