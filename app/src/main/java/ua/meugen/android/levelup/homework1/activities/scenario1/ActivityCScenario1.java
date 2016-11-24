package ua.meugen.android.levelup.homework1.activities.scenario1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityCScenario1 extends BaseActivity {

    public ActivityCScenario1() {
        super("ActivityC");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityDScenario1.class));
    }
}
