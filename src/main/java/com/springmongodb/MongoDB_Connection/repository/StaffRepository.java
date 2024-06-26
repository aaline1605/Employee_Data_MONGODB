package com.springmongodb.MongoDB_Connection.repository;

import com.springmongodb.MongoDB_Connection.entity.StaffEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface StaffRepository extends MongoRepository<StaffEntity,Integer> {

    //Method for findById
    Optional<StaffEntity> findById(int employeeId);
}
