package sp.fr.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import sp.fr.databinding.Person;
import sp.fr.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Person joe;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //instanciation d'une personne
        joe = new Person("user", "Joe");

        //Création d'un objet de liaison (de type binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Liaison entre le POJO et le layout
        binding.setPerson(joe);

    }

    public void onPromouvoir(View view) {

        joe.setName("Super");

    }
}
