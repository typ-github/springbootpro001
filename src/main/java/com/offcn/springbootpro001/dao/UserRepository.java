package com.offcn.springbootpro001.dao;

import com.offcn.springbootpro001.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
