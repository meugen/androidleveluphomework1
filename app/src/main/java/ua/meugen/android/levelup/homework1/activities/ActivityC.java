package ua.meugen.android.levelup.homework1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.meugen.android.levelup.homework1.R;
import ua.meugen.android.levelup.homework1.starters.ActivitiesStarterFactory;
import ua.meugen.android.levelup.homework1.starters.Order;

public class ActivityC extends BaseActivity {

    public ActivityC() {
        super("ActivityC");
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    @Override
    protected void startNextActivity(final Order order) {
        ActivitiesStarterFactory.create(order).startActivityD(this);
    }
}
