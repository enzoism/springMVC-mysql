package com.enzo.service.impl;

import com.enzo.dao.PersonMapperDao;
import com.enzo.entity.Person;
import com.enzo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired(required=false)
    private PersonMapperDao personMapperDao;
    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}