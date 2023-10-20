package org.example;
/**
 * Класс List односвязный список
 * @param <T> тип данных
 */
public class List <T> {
    /**
     * Node - узлы
     */
    private static class Node <T> {
        private final T data;
        private Node<T> next;

        /**
         * Конструктор с данными
         * @param data данные
         */
        private Node(T data) {
            this.data = data;
            next = null;
        }

        /**
         * @return возвращает строку узла
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> head;
    private Node<T> newNode;
    private int size;

    /**
     * Конструктор по умолчанию
     */
    public List() {
        head = null;
        size = 0;
    }

    /**
     * Вывод всех элементов списка
     * @return возвращает строку
     */
    @Override
    public String toString() {
        String str = " ";
        Node<T> currNode = head;
        while (currNode != null) {
            str += currNode.toString() + " ";
            currNode = currNode.next;
        }
        return str;
    }
    /**
     * Очистка
     */
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Добавление элемента в конец
     * @param data данные
     */
    public void pushBack(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new Node<>(data);
        }
        ++size;
    }

    /**
     * Получение элемента, хранящегося по индексу
     * @param i индекс
     * @return элемент
     */
    public T GetItem(int i) {
        Node<T> currNode = head;
        int j = 0;
        while (j != i) {
            currNode = currNode.next;
            ++j;
        }
        return currNode.data;
    }

    /**
     * Удаление элемента, хранящегося по индексу
     * @param i индекс
     */
    public void remove(int i) {
        Node<T> currNode = head;
        Node<T> previousNode = null;
        int j = 0;
        while (j != i) {
            previousNode = currNode;
            currNode = currNode.next;
            ++j;
        }
        if (previousNode == null) {
            head = currNode.next;
        } else {
            previousNode.next = currNode.next;
            currNode.next = null;
        }
        --size;
    }

    /**
     * Получение размера списка
     * @return число
     */
    public int size() {
        return size;
    }

    /**
     * Проверка на пустоту
     * @return булево значение
     */
    public boolean isEmpty() {
        return (head == null);
    }


}
