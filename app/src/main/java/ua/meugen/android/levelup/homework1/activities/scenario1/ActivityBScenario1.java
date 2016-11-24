package ua.meugen.android.levelup.homework1.activities.scenario1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityBScenario1 extends BaseActivity {

    public ActivityBScenario1() {
        super("ActivityB");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityCScenario1.class));
    }
}
