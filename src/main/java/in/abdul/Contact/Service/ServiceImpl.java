package in.abdul.Contact.Service;


import in.abdul.Contact.Entity.Contact;
import in.abdul.Contact.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {


    @Autowired
    Repo repo;

    @Override
    public String addContact(Contact contact) {

        contact = repo.save(contact);
        if (contact.getContactId() != null) {
            return "Contact saved";
        }
        return "Contact Not Found";
    }

    @Override
    public String updateContact(Contact contact) {
        if (repo.existsById(contact.getContactId())) {
            return "Contact updated";
        }
        return "Contact not found";
    }

    @Override
    public List<Contact> getAllContact() {
        return repo.findAll();

    }

    @Override
    public Optional<Contact> getById(Integer contactId) {

        return Optional.of(repo.findById(contactId).get());
    }

    @Override
    public String deleteById(Integer contactId) {
        if (repo.existsById(contactId)) {
            repo.deleteById(contactId);
            return "Contact deleted";
        }
        return "Contact not found";
    }
}
