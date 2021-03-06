package sp.fr.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Person extends BaseObservable {

    private String name;

    private String firstName;

    public Person() {
    }

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
        return this;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
        return this;
    }

}
