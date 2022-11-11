package task05.homework;

import task05.homework.pond.Pond;

public class PondLife { //жизнь в пруду
    /* домашнее задание: определить какую-нибудь предметную область, например: банк, университет, библиотека, склад,
    магазин, пруд и т.д.
       Ограничения:
            - минимум 3 класса,
            - наличие нескольких полей и методов,
            - использование модификаторов доступа,
            - использование принципов ООП.

     */
    public static void main(String[] args) {
        Pond pond = new Pond();
        System.out.println("Количество населяющей пруд живности: " + pond.getCustomerQuantity());
    }

}