package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        this.password = password;
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

    private boolean emailIsValid(String email) {
        int at = email.indexOf('@');
        if (at == -1 || email.lastIndexOf('@') != at) {
            return false;
        }
        if (email.indexOf('.', at + 1) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    /*
TODO Homework Password
1) + Min 8 symbols
2) + Min one symbol in uppercase
3) + Min one symbol in lowercase
4) + Min one symbol is digit
5) + Min one symbol is a special symbol (!%@*&)
*/
//    private boolean passwordInValid(String password) {
//        char[] strArr = password.toCharArray();
//        String validPassword = "";
//        if (password.length() < 8) {
//            return false;
//        }
//        for (char c : strArr) {
//            if (Character.isDigit(c)
//                    || Character.isUpperCase(c)
//                    || Character.isLowerCase(c)
//                    || c == '!'
//                    || c == '%'
//                    || c == '@'
//                    || c == '*'
//                    || c == '&') {
//                validPassword += c;
//            }
//        }
//
//        return password.equals(validPassword);
//    }
    private boolean isPasswordValid(String password) {
        char[] charArray = password.toCharArray(); // Преобразование пароля в массив символов
        String validPassword = ""; // Инициализация строки для валидного пароля

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

        // Проверка наличия всех необходимых условий для валидного пароля
        if (isUpperCase && isLowerCase && isDigit && isSpecialSymbol) {
            return true; // Возврат true, если все условия выполнены
        }

        return false; // Возврат false, если хотя бы одно условие не выполнено
    }
//    ===============================

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(isPasswordValid(password)){
            this.password = password;
        }else{
            System.out.println(password +" is not valid password");
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
