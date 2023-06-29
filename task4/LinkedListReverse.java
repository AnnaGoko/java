import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        // Создаем и заполняем LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
        // Выводим ИС
        System.out.println("Исходный список: " + list);
        
        // Переворачиваем список
        LinkedList<String> reversedList = reverseLinkedList(list);
        
        // Перевернутый список
        System.out.println("Перевернутый список: " + reversedList);
    }
    
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        
        // Итерируемся и добавляем элементы 
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        
        return reversedList;
    }
}