package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favdrink;
    private String favcolor;
    private String birthmonth;
    private boolean anypets;


// THIS IS FOR THE CSV FILE
    /*public Person(String fname, String lname, String fdrink, String fcolor, String bmonth, String pets) {
        this.firstname = fname;
        this.lastname = lname;
        this.favdrink = fdrink;
        this.favcolor = fcolor;
        this.birthmonth = bmonth;
        this.anypets = Boolean.valueOf(pets);
    } */

    public Person(String fname, String lname){
        this.firstname = fname;
        this.lastname = lname;
    }





    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFavdrink() {
        return favdrink;
    }

    public void setFavdrink(String favdrink) {
        this.favdrink = favdrink;
    }

    public String getFavcolor() {
        return favcolor;
    }

    public void setFavcolor(String favcolor) {
        this.favcolor = favcolor;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public boolean getAnypets() {
        return anypets;
    }

    public void setAnypets(boolean anypets) {
        this.anypets = anypets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", favdrink='" + favdrink + '\'' +
                ", favcolor='" + favcolor + '\'' +
                ", birthmonth='" + birthmonth + '\'' +
                ", anypets='" + anypets + '\'' +
                '}';
        }

    //public String toString() {
    //    return this.lastname + ", " + this.firstname;
    // }
}