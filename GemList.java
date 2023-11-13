//Created by Ayush Verma
//4B CS3 Mr. McBrayer

import java.util.LinkedList;

public class GemList {
    private String playerName;
    private LinkedList<Gem> gemList = new LinkedList<>();

    public GemList(String playerName) {
        this.playerName = playerName;
    }

    public int size() {
        return gemList.size();
    }

    public void draw(double y) {
        double xValue = 0.0;
        for (Gem g : gemList) {
            g.draw(xValue, y);
            xValue += 0.1;
        }
    }

    public String toString() {
        String result = "";
        for (Gem g : gemList) {
            result += g.toString() + " --> ";
        }
        return result;
    }

    public void insertBefore(Gem gem, int index) {
        if (index > size() - 1) {
            gemList.add(gem);
        } else {
            gemList.add(index, gem);
        }
    }

    public int score() {
        int totalScore = 0;
        int matchingScore = 0;
        int multiplier = 1;
        Gem temp = null;
        for (Gem g : gemList) {
            if (temp != null && g.getType() == temp.getType()) {
                multiplier++;
                matchingScore += g.getPoints();
            } else {
                totalScore += (multiplier * matchingScore);
                multiplier = 1;
                matchingScore = g.getPoints();
            }
            temp = g;
        }
        totalScore += (multiplier * matchingScore);

        return totalScore;
    }
}
