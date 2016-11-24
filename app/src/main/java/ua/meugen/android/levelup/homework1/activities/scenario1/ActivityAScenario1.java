package ua.meugen.android.levelup.homework1.activities.scenario1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityAScenario1 extends BaseActivity {

    public ActivityAScenario1() {
        super("ActivityA");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityBScenario1.class));
    }
}
