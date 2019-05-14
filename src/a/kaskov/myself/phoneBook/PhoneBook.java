package a.kaskov.myself.phoneBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {
    private String name; //название телефонного справочника
    private HashMap<People,String> phbook = new HashMap<>();

    public PhoneBook(String name) {
        this.name = name;
    }

    public void add(People _fio, String _phoneNumber){

/*        if  (!phbook.containsKey(_fio)){
            phbook.put(_fio,_phoneNumber);
        }
        else{
            System.out.println("В телефонной книге уже есть данный номер у другого человека");
        }*/
        phbook.put(_fio,_phoneNumber);

    }

    public void get(String _fio){

        Iterator it = phbook.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getKey().equals(_fio)){
                System.out.println("Найдены телефоны: "+pair.getKey().toString()+" = "+pair.getValue());
            }
        }
    }

}
