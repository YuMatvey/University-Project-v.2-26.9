import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 85.5f),
                new Student("Bob", 22, 90.0f),
                new Student("Charlie", 21, 88.0f)
        );

        StudentComparator comparator = ComparatorUtil.getStudentComparator(StudentComparatorType.AVERAGE_SCORE);
        List<Student> sortedStudents = students.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

        sortedStudents.forEach(student ->
                System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getAverageScore()));

        List<University> universities = Arrays.asList(
                new University("Harvard", 1636, 1),
                new University("Stanford", 1885, 2),
                new University("MIT", 1861, 3)
        );

        UniversityComparator universityComparator = ComparatorUtil.getUniversityComparator(UniversityComparatorType.RANKING);
        List<University> sortedUniversities = universities.stream()
                .sorted(universityComparator)
                .collect(Collectors.toList());

        sortedUniversities.forEach(university ->
                System.out.println(university.getName() + ", " + university.getEstablishedYear() + ", " + university.getRanking()));
    }
}
