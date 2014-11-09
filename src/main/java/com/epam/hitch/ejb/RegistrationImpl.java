package com.epam.hitch.ejb;

import com.epam.hitch.model.Driver;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created by Andrey on 09.11.2014.
 */
@Stateless
public class RegistrationImpl implements RegistrationLocal {
    @PersistenceContext(unitName = "persistenceUnit")
    EntityManager em;

    @Override
    public int register(Driver driver) {
        if(driver!=null) {
            em.persist(driver);
            return 1;
        }
        return 0;
    }
}
