package oop.enumeration;

public enum Country {
    JAPAN("Япония", 140_000_000, "японский"),
    GREECE("Греция", 10_000_000, "греческий"),
    ARGENTINA("Аргентина", 47_000_000, "v");

    private String name;
    private long peopleCount;
    private String language;

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }
}
