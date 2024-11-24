import java.util.*;
public class Mediator {
    private HashMap<IWidget, List<IWidget>> dependency = new HashMap<>();
    private IWidget currentTime;
    private IWidget currentWaqt;
    private IWidget location;
    private IWidget nextWaqt;
    private IWidget prayerTimeSettings;
    private IWidget prayerTimeTable;
    private IWidget timeZone;
    private IWidget waqtTime;
    public void set(IWidget currentTime, IWidget currentWaqt, IWidget location, IWidget nextWaqt, IWidget prayerTimeSettings, IWidget prayerTimeTable, IWidget timeZone, IWidget waqtTime) {
        this.currentTime = currentTime;
        this.currentWaqt = currentWaqt;
        this.location = location;
        this.nextWaqt = nextWaqt;
        this.prayerTimeSettings = prayerTimeSettings;
        this.prayerTimeTable = prayerTimeTable;
        this.timeZone = timeZone;
        this.waqtTime = waqtTime;
        this.register();
    }

    private void register() {
        dependency.put(timeZone, new ArrayList<>(List.of(currentTime, waqtTime)));
        dependency.put(location, new ArrayList<>(List.of(waqtTime)));
        dependency.put(prayerTimeSettings, new ArrayList<>(List.of(prayerTimeTable)));
        dependency.put(currentTime, new ArrayList<>(List.of(currentWaqt)));
        dependency.put(waqtTime, new ArrayList<>(List.of(currentWaqt, nextWaqt)));
        dependency.put(prayerTimeTable, new ArrayList<>(List.of(nextWaqt)));
    }

    public void notify(IWidget sender) {
        if (dependency.containsKey(sender)) {
            for (IWidget widget : dependency.get(sender)) {
                widget.update();
            }
        }
    }
}
