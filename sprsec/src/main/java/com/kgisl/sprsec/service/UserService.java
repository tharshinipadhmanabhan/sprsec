package com.kgisl.sprsec.service;

import java.util.List;


import com.kgisl.sprsec.model.User;


public interface UserService 
{
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
