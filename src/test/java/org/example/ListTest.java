package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListTest {//Проверка на добавление элемента в пустой список
    @Test
    void testPushBackInEmptyList() {
        List<Integer> list = new List<>();
        list.pushBack(1);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(1, list.GetItem(0));
    }

    //Проверка на добавление элемента в заполненный список
    @Test
    void testPushBackInFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
        assertEquals(637, list.GetItem(2));
    }

    //Проверка на получение элемента из заполненного списка
    @Test
    void testGetItemFromFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        assertEquals(2, list.GetItem(1));
    }

    //Проверка на удаление первого элемента списка
    @Test
    void testRemoveFirstElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        int size = list.size();
        list.remove(0);

        assertEquals(2, list.GetItem(0));
        assertEquals(size - 1, list.size());
    }

    //Проверка на удаление внутреннего элемента списка
    @Test
    void testRemoveInnerElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        int size = list.size();
        list.remove(1);

        assertEquals(637, list.GetItem(1));
        assertEquals(size - 1, list.size());
    }

    //Проверка на удаление последнего элемента списка
    @Test
    void testRemoveLastElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        int size = list.size();
        list.remove(2);

        assertEquals(2, list.GetItem(list.size() - 1));
        assertEquals(size - 1, list.size());
    }

    //Проверка пустого списка на пустоту
    @Test
    void testIsEmptyWithEmptyList() {
        List<Integer> list = new List<>();

        assertTrue(list.isEmpty());
    }

    //Проверка заполненного списка на пустоту
    @Test
    void testIsEmptyWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        assertFalse(list.isEmpty());
    }

    //Проверка на получение корректного размера пустого списка
    @Test
    void testSizeFromEmptyList() {
        List<Integer> list = new List<>();

        assertEquals(0, list.size());
    }

    //Проверка на получение корректного размера непустого списка
    @Test
    void testSizeFromFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);

        int size = list.size();
        list.remove(1);

        assertEquals(size - 1, list.size());
    }

    //Проверка вывода списка с пустым списком
    @Test
    void testToStringWithEmptyList() {
        List<Integer> list = new List<>();

        assertEquals(" ", list.toString());
    }

    //Проверка вывода списка с непустым списком
    @Test
    void testToStringWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(637);

        assertEquals(" 1 2 637 ", list.toString());
    }

    //Проверка очищения пустого списка
    @Test
    void testClearWithEmptyList() {
        List<Integer> list = new List<>();
        int size = list.size();
        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка очищения списка
    @Test
    void testClearWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(1);
        list.pushBack(2);
        int size = list.size();
        list.clear();

        assertEquals(size - 2, list.size());
    }

}