package ContactApp;

public class Contact {

        private String firstName;
        private String lastName;
        private String phoneNumber;

        public Contact (String firstName, String lastName, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setFirstName(String aFirstName) {
            this.firstName = aFirstName;
        }

        public void setLastName(String aLastName) {
            this.lastName = aLastName;
        }

        public void setPhoneNumber(String aPhoneNumber) {
            this.phoneNumber = aPhoneNumber;
        }

        public String contactInfo() {
            return firstName + " " + lastName + " " + phoneNumber;
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


