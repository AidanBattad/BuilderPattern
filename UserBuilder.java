public class UserBuilder {
    final String firstName;
    final String lastName;
    final String email;
    String address = "";
    String phone = "";
    int age = 0;
    public UserBuilder(String firstName, String lastName, String email) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UserBuilder withAddress(String address) 
    {
        this.address = address;
        return this;
    }

    public UserBuilder withPhone(String phone)
    {
        this.phone = phone;
        return this;
    }

    public UserBuilder withAge(int age) 
    {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(this);
        
    }
}
