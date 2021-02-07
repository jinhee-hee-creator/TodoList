package com.thepencil.journel.Service;

import com.thepencil.journel.model.User;
import com.thepencil.journel.service.UserService;
import com.thepencil.journel.service.UserServiceImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ServiceSpecTest {
   @Test
    public void createService(){
        UserServiceImpl userService = new UserServiceImpl();
      assertTrue(userService.count()==0);

    }
    @Test
public void addUserServiceTest(){
       UserServiceImpl userService = new UserServiceImpl();
       userService.add(new User("1","A"));
       assertEquals(userService.count(),1);

   }
   @Test
    public void meUserServiceTest(){
       UserServiceImpl userService = new UserServiceImpl();
       userService.add(new User("1","A"));
       assertEquals("1",userService.me().getId());
       assertEquals("A",userService.me().getName());

   }
}



