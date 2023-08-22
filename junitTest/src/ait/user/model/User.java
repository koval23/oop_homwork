package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailIsValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
    }

    // 1) '@' - exist and only one
    // 2) '.' - min one dot after '@'
    // 3) min two symbol after last dot
    // 4) alphabetic, digits, '@', '.', '_', '-'
    //TODO Character?
//    =========================
//    Задача 1
//    В проекте User из домашней работы, исправить
//    валидацию емейла так, чтобы валидный емейл с пробелами
//    вначале и в конце исправлялся и проходил валидаци. Скорректировать тест

//    Задача 2 advanced
//    В проекте User из домашней работы,
//    при валидации емейла и пароля,
//    используя метод split,
//    разделить емейл и пароль на массивы символов,
//    и в цикле обходить эти массивы,
//    проверяя каждый символ.
//    После исправления, проверить реализацию тестами.
//    "john@mail.com"
//    =========================

private boolean emailIsValid(String strEmail) {
    // Удаляем лишние пробелы из начала и конца строки
    String email = strEmail.trim();

//        TODO***************************************
          char[] chars = email.toCharArray();
//        TODO***************************************

    // Ищем символ @ в строке
    int at = email.indexOf('@');

    // Проверяем, что символ @ найден только один раз и не последний символ
    if (at == -1 || email.lastIndexOf('@') != at) {
        return false;
    }

    // Проверяем, есть ли точка после символа @
    if (email.indexOf('.', at + 1) == -1) {
        return false;
    }

    // Проверяем, что точка не находится слишком близко к концу строки
    if (email.lastIndexOf('.') >= email.length() - 2) {
        return false;
    }

    // Проверяем каждый символ в строке

//        TODO***************************************
        for (char c : chars) {
        if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-' || c == ' ')) {
            return false;
        }
    }
//        TODO***************************************

    // Если все проверки прошли успешно, то email считается действительным
    return true;
}

//    ===========================

/*
1) + Min 8 symbols
2) + Min one symbol in uppercase
3) + Min one symbol in lowercase
4) + Min one symbol is digit
5) + Min one symbol is a special symbol (!%@*&)
*/

    private boolean isPasswordValid(String userPassword) {

//        TODO***************************************
        String password = userPassword.trim();

//        TODO***************************************


        char[] charArray = password.toCharArray(); // Преобразование пароля в массив символов

        if (password.length() < 8) { // Проверка на минимальную длину пароля
            return false; // Возврат false, если длина пароля недостаточная
        }

        boolean isUpperCase = false; // Флаг наличия символа в верхнем регистре
        boolean isLowerCase = false; // Флаг наличия символа в нижнем регистре
        boolean isDigit = false; // Флаг наличия цифры
        boolean isSpecialSymbol = false; // Флаг наличия специального символа

        for (char c : charArray) {
            if (Character.isUpperCase(c)) { // Проверка на верхний регистр
                isUpperCase = true;
            } else if (Character.isLowerCase(c)) { // Проверка на нижний регистр
                isLowerCase = true;
            } else if (Character.isDigit(c)) { // Проверка на цифру
                isDigit = true;
            } else if (c == '!' || c == '%' || c == '@' || c == '*' || c == '&') { // Проверка на специальный символ
                isSpecialSymbol = true;
            }
        }

// Возврат false, если хотя бы одно условие не выполнено
        return isUpperCase && isLowerCase && isDigit && isSpecialSymbol;

    }
//    ===============================

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println(password + " is not valid password");
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
