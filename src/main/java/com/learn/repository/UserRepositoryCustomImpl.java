package com.learn.repository;

import com.learn.entities.User;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by farhans on 6/18/18.
 */
public class UserRepositoryCustomImpl implements UserRepositoryCustom{

    @PersistenceContext
    public EntityManager em;

    @Override
    public User findByEmailUsingJpql(String email){
       List<User> users = em.createQuery("Select u from User u where u.email = :email"  )
                .setParameter("email",email)
                .getResultList();
        return CollectionUtils.isEmpty(users) ? null : users.get(0);
    }


    //
    @Override
    public User findByEmailUsingJpqlTypedQuery(String email){
        List<User> users = em.createQuery("Select u from User u where u.email = :email",User.class)
                .setParameter("email",email)
                .getResultList();
        return CollectionUtils.isEmpty(users) ? null : users.get(0);
    }

    @Override
    public User findByEmailUsingNativeQuery(String email){
        List<User> users = em.createNativeQuery("Select u from user u where u.email = :email",User.class)
                .setParameter("email",email)
                .getResultList();
        return CollectionUtils.isEmpty(users) ? null : users.get(0);
    }

    @Override
    public User findByEmailUsingNamedQuery(String email){
        List<User> users = em.createNamedQuery("User.findFirst",User.class).getResultList();
        return CollectionUtils.isEmpty(users) ? null : users.get(0);

    }

    @Override
    public User findByEmailUsingCriteriaQuery(String email){
        /**/
        return null;
    }
}
