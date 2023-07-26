package in.abdul.Contact.Service;

import in.abdul.Contact.Entity.Contact;

import java.util.List;
import java.util.Optional;

public interface Service {


    // For adding all the contacts
    public String addContact(Contact contact);


    //For updating all the contacts
    public String updateContact(Contact contact);


    //For getting all the contacts
    public List<Contact> getAllContact();


    //For getting contact by id
    public Optional<Contact> getById(Integer contactId);


    //For deleting contact by id
    public String deleteById(Integer contactId);
}
