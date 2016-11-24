package ua.meugen.android.levelup.homework1.activities.order2;

import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityDOrder2 extends BaseActivity {

    public ActivityDOrder2() {
        super("ActivityD");
    }

    @Override
    protected void startNextActivity() {
        final Intent intent = new Intent(this, ActivityAOrder2.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }
}
