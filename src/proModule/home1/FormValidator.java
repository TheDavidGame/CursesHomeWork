package proModule.home1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormValidator {

    public static void checkName(String str) throws MyCheckedException {
        try {
            if (str.length() > 2 && str.length() < 20) {
                System.out.println("С именем все хорошо");
            } else {
                throw new MyCheckedException();
            }
        } catch (MyCheckedException e) {
            throw new MyCheckedException("Имя должно быть от 2 до 20 символов", e);
        }
    }

    public static void checkBirthdate(String str) throws MyCheckedException {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");

//        преобразуем строку в объект Date
        Date dateNow = null;
        try {
            dateNow = formatForDateNow.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            if (Integer.parseInt(str.substring(str.indexOf("", 6))) > 1900 && dateNow.before(date)) {
                System.out.println("С датой все хорошо");
            } else {
                throw new MyCheckedException();
            }
        } catch (MyCheckedException e) {
            throw new MyCheckedException("Дата должна быть не раньше 01.01.1900 и не позже текущей даты ", e);
        }
    }

    public static void checkGender(String str) {
        try {
            Gender.valueOf(str);
            System.out.println("С полом все хорошо");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Пол должен быть Male или Female", e);
        }
    }

    public static void checkHeight(String str){
        try {
            if(Double.parseDouble(str) > 0){
                System.out.println("С ростом все хорошо");
            }else{
                throw new NumberFormatException("Рост должен быть положительным");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
