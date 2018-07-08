package com.learn.repository;

import com.learn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farhans on 6/9/18.
 */
@Repository
public interface OfferRepository extends JpaRepository<Offer,Long>{
}
