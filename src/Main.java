// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}

/* Завдання 3.
ArrayList - це список на основі масиву.
LinkedList - це зв'язаний список на основі елементів і зв'язку між ними.

Всі операції в ArrayList виконуються за певний константний проміжок часу.
Додавання в кінець списку також виконується за певний константний час.
Крім того, в ArrayList немає додаткових витрат на зберігання зв"язків між елементами.
Мінуси - в швидкості вставки та видалення елементів що знаходсяться не в кінці списку,
так як при цьому всі елементи правіше від того, що додається або видаляється, зсуваються.
ArrayList слід використовувати, коли в пріорітеті доступ по індексу.

LinkedList зручніший, коли важливіше швидкість вставки та видалення, які в LinkedList
виконуються за константний проміжок часу. Операції доступа по індексу виконуються перебором
з початку або до кінця до наступного елементу.
Додаткові витрати на зберігання зв"язки між елементами.

Також ArrayList динамічно збільшує розмір масиву, якщо в ньому не вистачає місця, за допомогою методів add.
І може його зменшувати, якщо розмір більше кількості елементів, що в ньому зберігаються.

Тобто: якщо щось треба часто додавати або вставляти - обираємо LinkedList.
Також LinkedList працює швидше.
В інших випадках - ArrayList.


*/