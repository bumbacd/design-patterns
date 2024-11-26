public class Main {
    public static void main(String[] args) {
        // Folosind Singleton Pattern pentru GymManager
        GymManager manager = GymManager.getInstance();
        manager.manageGym();

        Gym gym = new Gym();

        GymMember member1 = new GymMember("Alina");
        GymMember member2 = new GymMember("Bogdan");

        gym.addMember(member1);
        gym.addMember(member2);

        // Gestionarea programului claselor
        ClassSchedule schedule = new ClassSchedule();
        schedule.addClass("Yoga");
        schedule.addClass("Pilates");

        // Notificarea membrilor despre noile clase
        gym.notifyMembers("New classes added: " + schedule.getClasses());

        // Actualizarea programului și notificarea membrilor
        schedule.addClass("Zumba");
        gym.notifyMembers("Updated class schedule: " + schedule.getClasses());
    }
}