package in.abdul.Contact.Controller;


import in.abdul.Contact.Entity.Contact;
import in.abdul.Contact.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {


    @Autowired
    Service service;


    @PostMapping(value = "/contact")
    public String addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }


    @PutMapping(value = "/contact")
    public String updateContact(@RequestBody Contact contact) {
        return service.updateContact(contact);
    }

    @GetMapping(value = "/contacts")
    public List<Contact> getAllContact() {
        return service.getAllContact();
    }

    @GetMapping(value = "/contact/{contactId}")
    public Optional<Contact> getById(@PathVariable Integer contactId) {
        return service.getById(contactId);
    }

    @DeleteMapping(value = "/contact/{contactId}")
    public String deleteById(Integer contactId) {
        return service.deleteById(contactId);
    }
}
