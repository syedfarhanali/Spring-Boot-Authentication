package com.learn.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by farhans on 6/14/18.
 */
@Entity
@Getter @Setter
@NamedQueries({
        @NamedQuery(name="User.findFirst",query="Select u from User u")
})
public class User extends BaseEntity{

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean active;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;



}
