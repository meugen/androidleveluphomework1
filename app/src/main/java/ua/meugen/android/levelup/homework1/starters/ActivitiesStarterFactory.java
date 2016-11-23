package ua.meugen.android.levelup.homework1.starters;

/**
 * Created by meugen on 23.11.16.
 */
public class ActivitiesStarterFactory {

    private ActivitiesStarterFactory() {}

    public static ActivitiesStarter create(final Order order) {
        ActivitiesStarter result = null;
        if (order == Order.ORDER31) {
            result = new Order31ActivitiesStarter();
        } else if (order == Order.ORDER32) {
            result = new Order32ActivitiesStarter();
        }
        return result;
    }
}
