public class Person {
    private String name;
    private String nationality;
    private String dream;

    public Person(String name, String nationality, String dream) {
        this.name = name;
        this.nationality = nationality;
        this.dream = dream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
    }
}