package ua.meugen.android.levelup.homework1.activities.scenario1;

import android.widget.Toast;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityDScenario1 extends BaseActivity {

    public ActivityDScenario1() {
        super("ActivityD");
    }

    @Override
    protected void startNextActivity() {
        Toast.makeText(this, "Nothing to do", Toast.LENGTH_LONG).show();
    }
}
