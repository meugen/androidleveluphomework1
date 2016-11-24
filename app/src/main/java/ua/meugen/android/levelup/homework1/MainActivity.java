package ua.meugen.android.levelup.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.meugen.android.levelup.homework1.activities.scenario1.ActivityAScenario1;
import ua.meugen.android.levelup.homework1.activities.scenario2.ActivityAScenario2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.activities_order_31).setOnClickListener(v -> activityOrder1());
        findViewById(R.id.activities_order_32).setOnClickListener(v -> activityOrder2());
    }

    private void activityOrder1() {
        final Intent intent = new Intent(this, ActivityAScenario1.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

    private void activityOrder2() {
        final Intent intent = new Intent(this, ActivityAScenario2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }
}
