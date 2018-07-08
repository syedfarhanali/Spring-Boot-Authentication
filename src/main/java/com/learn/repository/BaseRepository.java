package com.learn.repository;

import com.learn.entities.BaseEntity;
import com.learn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by farhans on 6/18/18.
 */
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T,Long> {
}
