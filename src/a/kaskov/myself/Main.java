package a.kaskov.myself;

import a.kaskov.myself.arrays.CheckArray;
import a.kaskov.myself.phoneBook.People;
import a.kaskov.myself.phoneBook.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        проверка валидности пароля
        if (checkPassword("Asdfds123#")){
            System.out.println("Пароль валидный");
        }
        else{
            System.out.println("Пароль плохой");
        }
        if (checkPassword("Asdfs1#")){
            System.out.println("Пароль валидный");
        }
        else{
            System.out.println("Пароль плохой");
        }
//        Работа с массивом

        String[] testArray = {"qqq","qq","qqq", "qqq" ,"wwwww","eee","rrr","rrrrrr","rrrr","rrrrrr","t","t","yyyyy","uuu","uu","iii"};

        CheckArray checkArray = new CheckArray();

        System.out.println(checkArray.getUniqueEl(testArray));
        System.out.println(checkArray.getCountUniqueEl(testArray));

//        Работа с телефонным справочником
        System.out.println("");

        PhoneBook phoneBook = new PhoneBook("Spb");

//        Scanner userInput = new Scanner(System.in);

/*        String fioPhone = "";

        while (!fioPhone.equals("exit")){

            System.out.println("Введите ФИО:НомерТелефона и нажмите Enter, или введите exit для того чтобы начать поиск:");
            fioPhone = userInput.nextLine();
            String[] items = fioPhone.split("(?=[+])",2);

            if (items.length==2){
                phoneBook.add(items[0],items[1]);
            }
        }

        System.out.println("Введите ФИО для поиска номера:");
        String fio = userInput.nextLine();
        phoneBook.get(fio);*/
//ФИО объект для того, чтобы в ключе можно было указывать дубли(дубли в кавычках)
        phoneBook.add(new People("Petrov"),"+7-911-234-1234");
        phoneBook.add(new People("Ivanov"),"+7-911-345-5673");
        phoneBook.add(new People("Petrov"),"+7-911-235-2356");
        phoneBook.add(new People("Ivanov"),"+7-911-865-3345");
        phoneBook.add(new People("Ivanov"),"+7-911-273-8352");
        phoneBook.add(new People("Ivanov"),"+7-911-238-8931");
//передается строка, для поиска по фио
        phoneBook.get("Ivanov");
    }

    public static boolean checkPassword(String _password){

        boolean result = false;

        String regEx = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,20}";
        if (_password.matches(regEx)){
            result = true;
        }

        return result;
    }
}
