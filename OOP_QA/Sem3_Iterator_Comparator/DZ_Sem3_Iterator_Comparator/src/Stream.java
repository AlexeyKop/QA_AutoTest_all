
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream(List<StudyGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int getGroupCount() {
        return groups.size();
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }
}
