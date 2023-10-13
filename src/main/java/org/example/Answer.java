package org.example;

public class Answer {
    int bull;
    int cow;
    int maxTry;

    public Answer(int bull, int cow, int maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "В вашем ответе: " +
                bull + " быков и " +
                cow + " коров. " +
                "Количество оставшихся попыток: " + maxTry;
    }
}
