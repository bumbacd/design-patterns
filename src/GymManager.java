//singletone
public class GymManager {
    private static GymManager instance;

    private GymManager() {
    }

    public static synchronized GymManager getInstance() {
        if (instance == null) {
            instance = new GymManager();
        }
        return instance;
    }

    public void manageGym() {
        System.out.println("Managing gym operations...");
    }
}