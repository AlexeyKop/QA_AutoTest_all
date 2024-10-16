package Lesson_11.Ex002Phonebook.Core.Infrastructure;

import Lesson_11.Ex002Phonebook.Core.Models.Contact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Contact> contacts;
    
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update обновление данных
    // ???...

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        // if ???...
        return contacts;
    }


    public int count() {
        return contacts.size();
    }

}
