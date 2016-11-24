package ua.meugen.android.levelup.homework1.activities.order2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityAOrder2 extends BaseActivity {

    public ActivityAOrder2() {
        super("ActivityA");
    }

    @Override
    protected void startNextActivity() {
        final Intent intent = new Intent(this, ActivityBOrder2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }
}
