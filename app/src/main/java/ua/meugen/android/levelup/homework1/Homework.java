package ua.meugen.android.levelup.homework1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.util.SparseArray;
import android.util.StringBuilderPrinter;

import java.util.List;
import java.util.Stack;

/**
 * Created by meugen on 23.11.16.
 */

public class Homework extends Application {

    private SparseArray<Stack<Activity>> tasks;
    private ActivityManager manager;

    @Override
    public void onCreate() {
        super.onCreate();
        this.tasks = new SparseArray<>();
        this.manager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
    }

    public void pushToStack(final Activity activity) {
        final int taskId = getCurrentTaskId();
        Stack<Activity> activities = this.tasks.get(taskId);
        if (activities == null) {
            activities = new Stack<>();
            this.tasks.put(taskId, activities);
        }
        activities.push(activity);
    }

    public void removeFromStack(final Activity activity) {
        final int taskId = getCurrentTaskId();
        final Stack<Activity> activities = this.tasks.get(taskId);
        if (activities != null) {
            activities.remove(activity);
        }
    }

    public CharSequence buildTaskString() {
        final int taskId = getCurrentTaskId();
        final Stack<Activity> activities = this.tasks.get(taskId);

        final StringBuilder builder = new StringBuilder();
        for (Activity activity : activities) {
            if (builder.length() > 0) {
                builder.append("->");
            }
            builder.append(activity);
        }
        return builder;
    }

    private int getCurrentTaskId() {
        return this.manager.getRunningTasks(1).get(0).id;
    }
}
