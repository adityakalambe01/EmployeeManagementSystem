package com.employeemanagementsystem.service;

import com.employeemanagementsystem.model.UserNotFoundException;
import com.employeemanagementsystem.model.Users;
import com.employeemanagementsystem.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    /*
    *
    * Get User by Email Id
    *
    * */
    protected Users getUserByEmailId(String emailId){
        return usersRepository.findByUserEmailId(emailId);
    }

    /*
    *
    * Get Users By Mobile Number
    *
    * */
    protected Users getUsersByMobileNumber(Long mobileNumber){
        return usersRepository.findByUserMobileNumber(mobileNumber);
    }

    /*
    *
    * Get Users by Id
    *
    * */
    protected Users getUsersById(Long userId){
        return usersRepository.findById(userId).get();
    }

    /*
    *
    * Add Account
    *
    * */
    protected boolean createAccount(Users user){
        user.setUserAccountCreationDateTime(LocalDateTime.now());
        user.setUserAccountUpdateDateTime(LocalDateTime.now());
        usersRepository.save(user);
        return true;
    }

    /*
    *
    * User Login
    *
    * */
    protected Boolean userLogin(String emailId, String password){
        try {
            Users dbUser = usersRepository.findByUserEmailId(emailId);
            if (dbUser == null) throw new UserNotFoundException();
            else if (dbUser.getUserPassword().equals(password)) {
                return true;
            }
        }catch (UserNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        return false;
    }

    /*
    *
    *
    *
    * */


}
