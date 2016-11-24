package ua.meugen.android.levelup.homework1.activities.order1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityBOrder1 extends BaseActivity {

    public ActivityBOrder1() {
        super("ActivityB");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityCOrder1.class));
    }
}
