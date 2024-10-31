public final class ComparatorUtil {
    private ComparatorUtil() {
        // Запрет создания экземпляров
    }

    public static StudentComparator getStudentComparator(StudentComparatorType type) {
        switch (type) {
            case NAME: return new StudentNameComparator();
            case AGE: return new StudentAgeComparator();
            case AVERAGE_SCORE: return new StudentAverageScoreComparator();
            default: throw new IllegalArgumentException("Unknown comparator type");
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType type) {
        switch (type) {
            case NAME: return new UniversityNameComparator();
            case ESTABLISHED_YEAR: return new UniversityEstablishedYearComparator();
            case RANKING: return new UniversityRankingComparator();
            default: throw new IllegalArgumentException("Unknown comparator type");
        }
    }
}