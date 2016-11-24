package ua.meugen.android.levelup.homework1.activities.scenario2;

import android.content.Intent;
import android.widget.Toast;

import ua.meugen.android.levelup.homework1.activities.BaseActivity;

public class ActivityAScenario2 extends BaseActivity {

    public ActivityAScenario2() {
        super("ActivityA");
    }

    @Override
    protected void startNextActivity() {
        final Intent intent = new Intent(this, ActivityBScenario2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this, "onNewIntent(" + intent + ")", Toast.LENGTH_LONG).show();
    }
}
