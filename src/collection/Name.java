package collection;

public class Name implements Comparable<Name>{
    private final String firstName, lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new NullPointerException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName(){
        return firstName;
    }
    public String lastName(){
        return lastName;
    }

    public boolean equals(Object o){ //can we override the method and use the old method inside it?
        if (!(o instanceof Name)) {
            return false;
        }
        Name n = (Name) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public int hashCode(){
        return 31*firstName.hashCode() + lastName.hashCode();
    } //usage of this line in this code (보통 메인메소드 에서 사용되는건지..?

    public String toString(){
        return firstName + " " + lastName;
    }

    public int compareTo(Name name) {
        int lastCmp = lastName.compareTo(name.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(name.firstName));
    }
}
