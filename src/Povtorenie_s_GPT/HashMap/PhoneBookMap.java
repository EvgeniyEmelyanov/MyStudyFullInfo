package Povtorenie_s_GPT.HashMap;

import java.util.HashMap;

public class PhoneBookMap {
    private HashMap<String, String> contact = new HashMap<>();


    public void addContact(String name, String phone) {
        contact.put(name, phone);
        System.out.println("Контакт \"" + contact.get(name) + "\" добавлен");

    }

    public void removeContact(String name) {
        if (contact.containsKey(name)) {
            System.out.println("Контакт \"" + name + "\" удален");
            contact.remove(name);

        } else {
            System.out.println("Контакт с именем \"" + name + "\" не найден");
        }
    }

    public boolean hasContact(String name) {
        return contact.containsKey(name);
    }

    public String getPhone(String name) {
        if (contact.containsKey(name)) {
            System.out.println("Телефона контакта \"" + name + "\" - " + contact.get(name));
            return contact.get(name);
        }
        return null;
    }

    public void ShowContacts() {
        System.out.println();
    }


}
