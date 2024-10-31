public class UniversityEstablishedYearComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return Integer.compare(u1.getEstablishedYear(), u2.getEstablishedYear());
    }
}
