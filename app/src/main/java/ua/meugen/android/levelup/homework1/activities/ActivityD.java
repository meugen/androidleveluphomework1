package ua.meugen.android.levelup.homework1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.meugen.android.levelup.homework1.R;
import ua.meugen.android.levelup.homework1.starters.ActivitiesStarterFactory;
import ua.meugen.android.levelup.homework1.starters.Order;

public class ActivityD extends BaseActivity {

    public ActivityD() {
        super("ActivityD");
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    @Override
    protected void startNextActivity(final Order order) {
        ActivitiesStarterFactory.create(order).startFinalActivity(this);
    }
}
