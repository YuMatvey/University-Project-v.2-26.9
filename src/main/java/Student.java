public class Student {
    private String name;
    private int age;
    private float averageScore;

    // Конструктор, геттеры и сеттеры
    public Student(String name, int age, float averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getAverageScore() {
        return averageScore;
    }
}

