public class StudentAverageScoreComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return Float.compare(s2.getAverageScore(), s1.getAverageScore()); // по убыванию
    }
}