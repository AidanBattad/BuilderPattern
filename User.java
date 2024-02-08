public class User {
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String address;
        private final String phone;
        private final int age;
        User(UserBuilder builder) 
        {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.address = builder.address;
            this.phone = builder.phone;
            this.age = builder.age;
        }
        @Override
        public String toString() {
            return "User{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
