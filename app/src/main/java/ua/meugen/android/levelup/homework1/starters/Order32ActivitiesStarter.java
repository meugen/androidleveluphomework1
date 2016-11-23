package ua.meugen.android.levelup.homework1.starters;

import android.content.Context;
import android.content.Intent;

import ua.meugen.android.levelup.homework1.activities.ActivityA;
import ua.meugen.android.levelup.homework1.activities.ActivityB;
import ua.meugen.android.levelup.homework1.activities.ActivityC;
import ua.meugen.android.levelup.homework1.activities.ActivityD;
import ua.meugen.android.levelup.homework1.activities.BaseActivity;

/**
 * Created by meugen on 23.11.16.
 */
class Order32ActivitiesStarter implements ActivitiesStarter {

    @Override
    public void startActivityA(final Context context) {
        final Intent intent = new Intent(context, ActivityA.class);
        intent.putExtra(BaseActivity.ORDER_KEY, Order.ORDER32.name());
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
        context.startActivity(intent);
    }

    @Override
    public void startActivityB(final Context context) {
        final Intent intent = new Intent(context, ActivityB.class);
        intent.putExtra(BaseActivity.ORDER_KEY, Order.ORDER32.name());
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public void startActivityC(final Context context) {
        final Intent intent = new Intent(context, ActivityC.class);
        intent.putExtra(BaseActivity.ORDER_KEY, Order.ORDER32.name());
        context.startActivity(intent);
    }

    @Override
    public void startActivityD(final Context context) {
        final Intent intent = new Intent(context, ActivityD.class);
        intent.putExtra(BaseActivity.ORDER_KEY, Order.ORDER32.name());
        context.startActivity(intent);
    }

    @Override
    public void startFinalActivity(final Context context) {
        final Intent intent = new Intent(context, ActivityA.class);
        intent.putExtra(BaseActivity.ORDER_KEY, Order.ORDER32.name());
        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
        context.startActivity(intent);
    }
}
