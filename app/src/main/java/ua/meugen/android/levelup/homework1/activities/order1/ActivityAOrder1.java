package ua.meugen.android.levelup.homework1.activities.order1;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityAOrder1 extends BaseActivity {

    public ActivityAOrder1() {
        super("ActivityA");
    }

    @Override
    protected void startNextActivity() {
        this.startActivity(new Intent(this, ActivityBOrder1.class));
    }
}
