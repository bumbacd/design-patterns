import java.util.ArrayList;
import java.util.List;

class ClassSchedule {
    private List<String> classes;

    public ClassSchedule() {
        classes = new ArrayList<>();
    }

    public void addClass(String className) {
        classes.add(className);
    }

    public void removeClass(String className) {
        classes.remove(className);
    }

    public List<String> getClasses() {
        return classes;
    }
}