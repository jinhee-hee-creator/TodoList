package com.thepencil.journel;


import com.thepencil.journel.model.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserSpecTest {
   @Test
    public void createUser(){
       User user = new User("1","이진희");
       assertEquals(user.getId(),"1");
       assertEquals(user.getName(),"이진희");


    }
}
