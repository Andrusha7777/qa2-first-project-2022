package model;

public class Weather {
    private long id;
    private String main;
    private String description;
    private String iconl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconl() {
        return iconl;
    }

    public void setIconl(String iconl) {
        this.iconl = iconl;
    }
}
