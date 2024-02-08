public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Aidan", "Liam", "Aidan.liam@gmail.com")
                .withAddress("123 Main St")
                .withPhone("555-1234")
                .withAge(20)
                .build();
        User user2 = new User.UserBuilder("Juan", "Tam", "Juan.tam@gmail.com")
                .build();
        System.out.println(user1);
        System.out.println(user2);
    }
}
