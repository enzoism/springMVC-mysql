package com.enzo.dao;

import com.enzo.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}
//public class PersonMapperDao {
//    public Person findPersonById(long id){
//        return new Person();
//    }
//}