package in.abdul.Contact.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ContactApplication")
@Data
public class Contact {
   @Id
   @GeneratedValue ()
   private Integer contactId;
   private String contactName;
   private String contactEmail;
   private Long phone;

}
