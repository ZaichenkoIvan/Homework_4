package hometask.proxy.service;

import hometask.proxy.domain.User;
import hometask.proxy.exception.EntityNotFoundRuntimeException;
import hometask.proxy.exception.EntityNullRuntimeException;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        if(id == null){
            throw new EntityNullRuntimeException("Id is null");
        }

        if (id == 1) {
            return new User();
        }
        throw new EntityNotFoundRuntimeException("User are not exist");
    }
}
