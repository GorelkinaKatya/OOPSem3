package org.example;

public enum GameStatus {
    INIT(""), START("Начало игры"), WIN("Поздравляем! Вы выиграли!"), LOSE("К сожалению, вы проиграли!");
    private final String description;

    GameStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
