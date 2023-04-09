package Lession1;

public class Main {


    public static void main(String[] ages) {
       Author puchkin = new Author("Пушкин", "Александр");
        Book onegin = new Book("Евгений Онегин", puchkin, 1831);
        System.out.print(puchkin.getFirstName());
        System.out.println(" "+puchkin.getLastName());
        System.out.println(onegin.getNameBook());
        System.out.println("год "+onegin.getYear());
        System.out.println(onegin.getAuthor());
        onegin.setYear(1931);
        System.out.println(onegin.getYear());
        Author dostoevskii = new Author("Достоевский", "Федор");
        Book prestuplenie = new Book("Преступление и наказание", dostoevskii, 1956);
        System.out.print(dostoevskii.getFirstName());
        System.out.println(" "+dostoevskii.getLastName());
        System.out.println(prestuplenie.getNameBook());
        System.out.println("год "+prestuplenie.getYear());

    }
}