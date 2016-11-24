package ua.meugen.android.levelup.homework1.activities.scenario2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityCScenario2 extends BaseActivity {

    public ActivityCScenario2() {
        super("ActivityC");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityDScenario2.class));
    }
}
