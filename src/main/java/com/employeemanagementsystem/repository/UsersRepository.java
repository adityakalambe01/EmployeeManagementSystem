package com.employeemanagementsystem.repository;

import com.employeemanagementsystem.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByUserEmailId(String emailId);

    Users findByUserMobileNumber(Long mobileNumber);
}
