package ua.meugen.android.levelup.homework1.activities.scenario2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityBScenario2 extends BaseActivity {

    public ActivityBScenario2() {
        super("ActivityB");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityCScenario2.class));
    }
}
