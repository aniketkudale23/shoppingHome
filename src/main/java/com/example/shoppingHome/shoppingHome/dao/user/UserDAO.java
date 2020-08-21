package com.example.shoppingHome.shoppingHome.dao.user;

import com.example.shoppingHome.shoppingHome.entities.user.Registeruser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserDAO extends MongoRepository<Registeruser, Object> {

//
//    @Transactional
//    @Query("select count(*) > 0 from Register where email = ?1")
//    boolean existByEmail(String email);

    List<Registeruser> findByEmailAndUserName(String email, String password);

    List<Registeruser> findByEmail(String email);

    List<Registeruser> findByUserName(String userName);


    //boolean exists(String userName);

    List<Registeruser> findByUserNameAndPassword(String userName, String password);


}
