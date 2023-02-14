package movies;

public class Movie {

    private String name;

    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    //accessors

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
