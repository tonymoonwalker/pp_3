package com.tmw.pp_3.repository;

import com.tmw.pp_3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
