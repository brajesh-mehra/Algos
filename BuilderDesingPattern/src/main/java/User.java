public class User {
    private String name;
    private String age;
    private Address address;

    User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age + " " + this.address.getLine1() + " " + this.address.getLine2();
    }

    public static class UserBuilder {

        private String name;
        private String age;
        private Address address;

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        private UserBuilder(){}

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return  new User(this);
        }
    }
}

