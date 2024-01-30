import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FirstStudent implements Student{
    static String id;
    int score1,score2,score3;

    @Override
    public void SetScore(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void SetID(String id) {
        this.id = id;
    }

    @Override
    public String GetID() {
        return id;
    }

    @Override
    public double CalAverage(int score1, int score2, int score3) {
        return (score1 + score2 + score3)/3.0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        FirstStudent f1 = new FirstStudent();

        id = in.readLine();
        System.out.println("ID: " + f1.GetID());
        System.out.println("test1 score: ");
        int m = Integer.parseInt(in.readLine());
        System.out.println("test2 score: ");
        int e = Integer.parseInt(in.readLine());
        System.out.println("test3 score: ");
        int k = Integer.parseInt(in.readLine());

        f1.SetScore(m, e, k);
        System.out.println("avg: " + f1.CalAverage(m, e, k));

    }
}

