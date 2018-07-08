package com.learn.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by farhans on 6/14/18.
 */
@Entity
@Getter
@Setter
public class Role extends BaseEntity  implements GrantedAuthority {

    private String role;

    @Override
    public String getAuthority() {
        return role;
    }
}
