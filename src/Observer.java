interface Observer {
    void update(String message);
}

class GymMember implements Observer {
    private String name;

    public GymMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }

    public String getName() {
        return name;
    }
}