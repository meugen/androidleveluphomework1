package ua.meugen.android.levelup.homework1.activities.scenario2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityDScenario2 extends BaseActivity {

    public ActivityDScenario2() {
        super("ActivityD");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityAScenario2.class));
    }
}
