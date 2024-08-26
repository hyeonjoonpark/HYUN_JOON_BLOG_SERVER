package org.hyunjooon.blog.domain.user.repository;

import org.hyunjooon.blog.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
