public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Design Pattern");

        Address add = new Address();
        add.setLine1("C905");
        add.setLine2("202");

        User usr = User.UserBuilder.builder().setName("Brajesh Mehra").setAge("30").setAddress(add).build();
        System.out.println(usr.toString());
    }
}
