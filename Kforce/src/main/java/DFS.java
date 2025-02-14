@Author("John Snow")
@Author("Rob Stark")
@Author("Tywin Lannister")
public class DFS {

    public String Name;
    public static void main(String[] args)
    {
        System.out.println("Tests Spring Boot");
    }

    Book gameOfThrones = new DFS();
    Author[] authors = gameOfThrones.getClass().getAnnotationsByType(Author.class);
    for (Author author :authors)
    {
        System.out.println(author.value());
    }
}
