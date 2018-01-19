package sp.fr.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Conversion extends BaseObservable {

    private String yen;
    private String euros;
    private Double transit;

    public Conversion() {

    }

    public Conversion(String euros) {
        this.euros = euros;

        this.transit = Double.parseDouble(this.euros) * 135.869324;
        this.yen = String.valueOf(this.transit);
    }

    @Bindable
    public String getYen() {
        return yen;
    }

    public Conversion setYen(String yen) {
        this.yen = yen;

        notifyPropertyChanged(BR.yen);
        return this;
    }

    @Bindable
    public String getEuros() {
        return euros;
    }

    public Conversion setEuros(String euros) {
        this.euros = euros;

        this.transit = Double.parseDouble(this.euros) * 135.869324;
        this.yen = String.valueOf(transit);

        notifyPropertyChanged(BR.euros);
        notifyPropertyChanged(BR.yen);
        return this;
    }
}
