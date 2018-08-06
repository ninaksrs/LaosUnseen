package latthida.fenuol.edu.la.laosunseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import latthida.fenuol.edu.la.laosunseen.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();

        }
    }   // Main Method

}   // Main Class
