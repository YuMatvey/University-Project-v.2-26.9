
public class University {
    private String name;
    private int establishedYear;
    private int ranking;

    // Конструктор, геттеры и сеттеры
    public University(String name, int establishedYear, int ranking) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public int getRanking() {
        return ranking;
    }
}