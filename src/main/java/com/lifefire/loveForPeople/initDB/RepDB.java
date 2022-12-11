package com.lifefire.loveForPeople.initDB;

import com.lifefire.loveForPeople.entity.Motivation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepDB extends CrudRepository<Motivation, Long> {
}
