package objetos;

public class Album {
    private int userId, id;
    private String title;

    public Album(int userId, String title) {
        this.userId = userId;
        this.title = title;
    }

    public Album() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
