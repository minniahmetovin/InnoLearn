package task06.lesson;

import jdk.jfr.Name;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Мой первый класс (JavaDoc)
 */
public final class ClassName extends SuperClassName implements InterfaceName, Serializable {
    /* -модификаторы protected и private нет смысла использовать
    - модификатор final означает, что от него нельзя наследоваться
    - модификатор abstract означает обязательное наличие наследования от него
    - класс не должен начинаться на цифру в названии
    - нет множественного наследования
    - implements означает реализацию некоторого интерфейса, своего рода как наследование,
    но нет реализации метода
    - модификаторы доступа пишутся в любой последовательности, но лучше начинать с..
    */
    public static final int SIZE = 2; //константы пишутся БОЛЬШОЙ БУКВОЙ

    /**
     * Моё первое поле (JavaDoc), но чаше они идут не к полям, а к методам
     */
    private int get2() {
        return 2;
    }

    @Deprecated
    // аннотаций может быть несколько, данная аннотация вешается на те поля и методы, которые планируется убрать
    public transient volatile int fieldName = get2(), fieldName2, fieldName3 = 2;
                                            /* - volatile используется для многопоточного исполнения
                                            - transient указывает, что данное поле не нужно сериализовать
                                            - имена переменных пишутся в camelCase
                                             */

    public final synchronized void methodName(final String paramName, String paramName2, int... numbers) {
                                                                        /* synchronized используется для многопоточки
                                                                        void означает, что метод ничего не возвращает */
        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public void print() {
    }

}




