package task06.lesson;

import java.io.Serializable;

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
    public static final int SIZE= 2; //константы пишутся БОЛЬШОЙ БУКВОЙ
    /**
     * Моё первое поле (JavaDoc)
     */
    public transient volatile int fieldName = SIZE;
                                            /* - volatile используется для многопоточного исполнения
                                            - transient указывает, что данное поле не нужно сериализовать
                                            - имена переменных пишутся в camelCase
                                             */

    @Override
    public void print() {
    }
}



