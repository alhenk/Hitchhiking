package com.epam.hitch.managed;

import com.epam.hitch.ejb.RegistrationLocal;
import com.epam.hitch.model.Driver;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Andrey on 09.11.2014.
 */
@ManagedBean(name = "driver")
@RequestScoped
public class DriverManaged implements Serializable {

    @Inject
    private RegistrationLocal registration;

    private String firstName;
    private String lastName;
    private boolean success;

    public DriverManaged() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void registerTheDriver(ActionEvent event) {
        Driver driver = new Driver();
        driver.setFirstName(firstName);
        driver.setLastName(lastName);
        if (registration.register(driver)==1) {
            success = true;
        }
    }

    public String getOutputText() {
        String registered = "Successfully registered "+firstName;
        String notRegistered = "Please register";
        return success ? registered : notRegistered;
    }
}
