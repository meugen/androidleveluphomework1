package ua.meugen.android.levelup.homework1.activities.order2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityCOrder2 extends BaseActivity {

    public ActivityCOrder2() {
        super("ActivityC");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityDOrder2.class));
    }
}
