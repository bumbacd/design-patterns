import java.util.ArrayList;
import java.util.List;

class Gym {
    private List<Observer> members = new ArrayList<>();

    public void addMember(Observer member) {
        members.add(member);
    }

    public void removeMember(Observer member) {
        members.remove(member);
    }

    public void notifyMembers(String message) {
        for (Observer member : members) {
            member.update(message);
        }
    }
}