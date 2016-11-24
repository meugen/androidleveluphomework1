package ua.meugen.android.levelup.homework1.activities.order1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityCOrder1 extends BaseActivity {

    public ActivityCOrder1() {
        super("ActivityC");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityDOrder1.class));
    }
}
