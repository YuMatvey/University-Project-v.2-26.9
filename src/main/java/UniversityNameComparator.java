public class UniversityNameComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return u1.getName().compareTo(u2.getName());
    }
}
