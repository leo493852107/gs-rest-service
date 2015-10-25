package hello;

/**
 * Created by leo on 15/10/25.
 */
public class QueryScore {

    private long id;
    private float score;

    public QueryScore(long id, float score) {
        this.id = id;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public float getScore() {
        return score;
    }
}
