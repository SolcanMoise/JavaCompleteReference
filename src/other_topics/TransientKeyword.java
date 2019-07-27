package other_topics;

import java.io.Serializable;
import java.util.Objects;

/**
 * Transient is a variables modifier used in serialization. When JVM comes across transient keyword
 * it ignores original value of the variable and save default value of the variable data type.
 *
 * @author solcanm
 * @date 2019-07-27
 */
public class TransientKeyword implements Serializable {

    // Making password transient for security
    private transient String password;

    // Making age transient as age is auto-computable from DOB and current date.
    transient int age;

    // serialize other fields
    private String username, email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransientKeyword that = (TransientKeyword) o;
        return age == that.age &&
                Objects.equals(password, that.password) &&
                Objects.equals(username, that.username) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, age, username, email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransientKeyword{");
        sb.append("password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append(", username='").append(username).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
