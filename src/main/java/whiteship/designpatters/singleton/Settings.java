package whiteship.designpatters.singleton;

public class Settings {

    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {  // 여기서만 동기화!
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }

}
