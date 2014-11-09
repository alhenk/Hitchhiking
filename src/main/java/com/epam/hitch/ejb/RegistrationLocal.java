package com.epam.hitch.ejb;

import com.epam.hitch.model.Driver;

import javax.ejb.Local;

/**
 * Created by Andrey on 09.11.2014.
 */
@Local
public interface RegistrationLocal {
    public int register(Driver driver);
}
