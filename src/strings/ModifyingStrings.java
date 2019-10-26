package strings;

/**
 * Because Strings are immutable, whenever you want to modify a String, you must either
 * copy it into a StringBuffer or StringBuilder, or use one of the following String
 * methods, which will construct a new copy of the String with your modifications
 * complete.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-10-26
 */
public class ModifyingStrings {

    private static String createEmail(final String name, final String surname) {
        return name.concat(".").concat(surname).concat("@yahoo.com");
    }

    private static String createPassword(final String name, final String surname, int startIndex, int endIndex) {
        return name.substring(startIndex).concat(surname.substring(0, endIndex));
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Name");
        account.setSurname("Surname");
        account.setPassword(createPassword("Name", "Surname", 2, 3));
        account.setEmail(createEmail("Name", "Surname"));
        System.out.println(account);
    }


    static class Account {
        private String name;
        private String surname;
        private String email;
        private String password;

        public String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        void setSurname(String surname) {
            this.surname = surname;
        }

        public String getEmail() {
            return email;
        }

        void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Account{");
            sb.append("name='").append(name).append('\'');
            sb.append(", surname='").append(surname).append('\'');
            sb.append(", email='").append(email).append('\'');
            sb.append(", password='").append(password).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
