package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Syrius on 6/30/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
