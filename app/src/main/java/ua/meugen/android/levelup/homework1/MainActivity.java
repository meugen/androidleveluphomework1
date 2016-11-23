package ua.meugen.android.levelup.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.meugen.android.levelup.homework1.starters.ActivitiesStarterFactory;
import ua.meugen.android.levelup.homework1.starters.Order;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.activities_order_31).setOnClickListener(v -> activityOrder31());
        findViewById(R.id.activities_order_32).setOnClickListener(v -> activityOrder32());
    }

    private void activityOrder31() {
        ActivitiesStarterFactory.create(Order.ORDER31).startActivityA(this);
    }

    private void activityOrder32() {
        ActivitiesStarterFactory.create(Order.ORDER32).startActivityA(this);
    }
}
