package ContactApp;

public class Contact {

        public String firstName;
        public String lastName;
        public String phoneNumber;

        public Contact (String firstName, String lastName, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }


        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName, phoneNumber);
        }
//        public static void main(String[] args) {
//            ContactApp.Contact rick = new ContactApp.Contact();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());
//            // prints "Hello from Rick Sanchez!"
//        }
    }


