package com.enzo.dao;

import com.enzo.entity.Person;

public interface PersonMapperDao {
    Person findPersonById(long id);
}