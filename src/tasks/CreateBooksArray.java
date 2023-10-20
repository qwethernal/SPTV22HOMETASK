package tasks;

import tasks.createbooksarray.Author;
import tasks.createbooksarray.Book;

public class CreateBooksArray {

    public void doCreateArray() {
        Author author1 = new Author("Толстой", "Лев", new Book[]{
                new Book("Война и мир", 1869),
                new Book("Анна Каренина", 1877)
        });

        Author author2 = new Author("Достоевский", "Федор", new Book[]{
                new Book("Преступление и наказание", 1866),
                new Book("Братья Карамазовы", 1880)
        });

        Author author3 = new Author("Чехов", "Антон", new Book[]{
                new Book("Вишневый сад", 1904),
                new Book("Три сестры", 1901)
        });

        Author author4 = new Author("Тургенев", "Иван", new Book[]{
                new Book("Отцы и дети", 1862),
                new Book("Дворянское гнездо", 1859)
        });

        Author author5 = new Author("Гоголь", "Николай", new Book[]{
                new Book("Мертвые души", 1842),
                new Book("Ревизор", 1836)
        });

        Author author6 = new Author("Пушкин", "Александр", new Book[]{
                new Book("Евгений Онегин", 1833),
                new Book("Руслан и Людмила", 1820)
        });

        Author[] authors = {author1, author2, author3, author4, author5, author6};

        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
