package billflores.com.android_list_sample.entity;

/**
 * Created by Bill on 20/09/2017.
 */

public class Person {
    private String name;
    private int dni;

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
