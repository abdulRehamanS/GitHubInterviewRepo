package in.abdul.Contact.Repository;

import in.abdul.Contact.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Repo extends JpaRepository<Contact , Serializable> {

}
