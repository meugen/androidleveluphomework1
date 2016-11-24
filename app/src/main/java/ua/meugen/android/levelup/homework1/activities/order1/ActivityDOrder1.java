package ua.meugen.android.levelup.homework1.activities.order1;

import android.widget.Toast;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityDOrder1 extends BaseActivity {

    public ActivityDOrder1() {
        super("ActivityD");
    }

    @Override
    protected void startNextActivity() {
        Toast.makeText(this, "Nothing to do", Toast.LENGTH_LONG).show();
    }
}
