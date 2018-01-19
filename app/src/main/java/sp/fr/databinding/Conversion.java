package sp.fr.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Conversion extends BaseObservable {

    private String yen;
    private String euros;
    private Double rate = 135.869324;

    public Conversion() {

    }

    public Conversion(String euros) {
        this.euros = euros;

        this.yen = String.valueOf(Double.parseDouble(this.euros) * rate);
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

        if(! euros.equals("")) {
            this.euros = euros;
            this.yen = String.valueOf(Double.parseDouble(this.euros) * rate);
        } else {
            this.euros = String.valueOf(0);
            this.yen = String.valueOf(0.0);
        }


        notifyPropertyChanged(BR.euros);
        notifyPropertyChanged(BR.yen);
        return this;

    }
}
