public class UniversityRankingComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return Integer.compare(u1.getRanking(), u2.getRanking());
    }
}