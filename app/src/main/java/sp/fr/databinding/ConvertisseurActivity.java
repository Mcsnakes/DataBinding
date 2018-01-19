package sp.fr.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sp.fr.databinding.databinding.ActivityConvertisseurBinding;

public class ConvertisseurActivity extends AppCompatActivity {

    Conversion argent;
    ActivityConvertisseurBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertisseur);

        //instanciation d'une personne
        argent = new Conversion("10");

        //Création d'un objet de liaison (de type binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_convertisseur);

        //Liaison entre le POJO et le layout
        binding.setConversion(argent);
    }



}
