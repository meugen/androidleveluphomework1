package ua.meugen.android.levelup.homework1.activities.order2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityBOrder2 extends BaseActivity {

    public ActivityBOrder2() {
        super("ActivityB");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityCOrder2.class));
    }
}
