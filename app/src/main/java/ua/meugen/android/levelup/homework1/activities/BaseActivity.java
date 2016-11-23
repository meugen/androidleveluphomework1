package ua.meugen.android.levelup.homework1.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import ua.meugen.android.levelup.homework1.Homework;
import ua.meugen.android.levelup.homework1.R;
import ua.meugen.android.levelup.homework1.starters.Order;

/**
 * Created by meugen on 23.11.16.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public static final String ORDER_KEY = "order";
    public static final String CONTENT_KEY = "content";

    private static final long DELAY = 500L;

    private final Handler handler;
    private final String tag;

    private Homework homework;

    private Order order;
    private CharSequence content;

    public BaseActivity(final String tag) {
        this.handler = new Handler();
        this.tag = tag;
    }

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.homework = (Homework) getApplicationContext();
        this.homework.pushToStack(this);
    }

    @Override
    protected void onPostCreate(@Nullable final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        if (savedInstanceState == null) {
            this.order = Order.valueOf(getIntent().getStringExtra(ORDER_KEY));
            // this.content = this.homework.buildTaskString();
        } else {
            this.order = Order.valueOf(savedInstanceState.getString(ORDER_KEY));
            this.content = savedInstanceState.getCharSequence(CONTENT_KEY);
        }

        findViewById(R.id.next).setOnClickListener(v -> startNextActivity(this.order));
        this.handler.postDelayed(this::updateContent, DELAY);
    }

    private void updateContent() {
        if (this.content == null) {
            this.content = this.homework.buildTaskString();
        }
        ((TextView) findViewById(R.id.task_content)).setText(this.content);
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(ORDER_KEY, this.order.name());
        outState.putCharSequence(CONTENT_KEY, this.content);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        this.homework.removeFromStack(this);
        super.onDestroy();
    }

    @Override
    public String toString() {
        return this.tag + "[" + this.hashCode() + "]";
    }

    protected abstract void startNextActivity(final Order order);
}
