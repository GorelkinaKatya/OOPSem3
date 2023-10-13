package org.example;

import java.util.ArrayList;
import java.util.Scanner;
/*Дописать игру быки-коровы
- на русском и английском алфавите
- сделать логирование действий и по запросу пользователя посмотреть всю историю игры (answer записывать в ArrayList)
- доработать интерфейс взаимодействия с пользователем (показать/скрыть compWord; выбрать RU ENG NUMB; enum содержание if win if lose)
- * реализовать перезапуск игры (stop, resume, restart (case))*/
public class Main {
    public static void main(String[] args) {
        /*Game newGame(NumberGame game) {
            game.start(5, 1);
            while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                Scanner scanner = new Scanner(System.in);
                Answer answer = game.inputValue(scanner.nextLine());
                System.out.println("answer = " + answer);
            }
            System.out.println("game.getGameStatus() = " + game.getGameStatus());
        }*/

        System.out.println("Добрый день, пользователь! Предлагаю сыграть со мной в игру 'Быки-коровы'\n" +
                "Введите порядковый номер варианта условий игры:\n" +
                "1. Хочу угадать число\n" +
                "2. Хочу угадать слово на русском языке\n" +
                "3. Хочу угадать слово на английском языке");

        Scanner gameType = new Scanner(System.in);
        int choice = gameType.nextInt();
        if (choice == 1) {
            Game gameNum = new NumberGame();
            gameNum.start(3, 2);
            System.out.println("Хотите узнать правильный ответ заранее? (y/n) ");
            Scanner yesNo = new Scanner(System.in);
            String knowWord = yesNo.nextLine();
            if (knowWord.equals("y")) {
                AbstractGame.showWord();
            }
            System.out.println("Максимальное количество попыток " + AbstractGame.getMaxTry());
            ArrayList<String> logList = new ArrayList<>();
            while (gameNum.getGameStatus() != GameStatus.WIN && gameNum.getGameStatus() != GameStatus.LOSE) {
                System.out.println("Введите " + AbstractGame.getSizeWord() + "-значное число: ");
                Scanner scanner = new Scanner(System.in);
                String inputValue = scanner.nextLine();
                Answer answer = gameNum.inputValue(inputValue);
                logList.add(inputValue);
                System.out.println(answer);
            }
            System.out.println(gameNum.getGameStatus().getDescription());
            System.out.println("Хотите посмотреть историю игры? y/n");
            Scanner yN = new Scanner(System.in);
            String history = yN.nextLine();
            if (history.equals("y")) {
                System.out.println("История ответов пользователя: " + logList);
            }
        } else if (choice == 2) {
            Game gameRus = new RusAlphabetGame();
            gameRus.start(4, 2);
            System.out.println("Хотите узнать правильный ответ заранее? (y/n) ");
            Scanner yesNo = new Scanner(System.in);
            String knowWord = yesNo.nextLine();
            if (knowWord.equals("y")) {
                AbstractGame.showWord();
            }
            System.out.println("Максимальное количество попыток " + AbstractGame.getMaxTry());
            ArrayList<String> logList = new ArrayList<>();
            while (gameRus.getGameStatus() != GameStatus.WIN && gameRus.getGameStatus() != GameStatus.LOSE) {
                System.out.println("Введите слово из " + AbstractGame.getSizeWord() + "-х букв: ");
                Scanner scanner = new Scanner(System.in);
                String inputValue = scanner.nextLine();
                Answer answer = gameRus.inputValue(inputValue);
                logList.add(inputValue);
                System.out.println(answer);
            }
            System.out.println(gameRus.getGameStatus().getDescription());
            System.out.println("Хотите посмотреть историю игры? y/n");
            Scanner yN = new Scanner(System.in);
            String history = yN.nextLine();
            if (history.equals("y")) {
                System.out.println("История ответов пользователя: " + logList);
            }
        } else if (choice == 3) {
            Game gameEng = new EngAlphabetGame();
            gameEng.start(4, 2);
            System.out.println("Хотите узнать правильный ответ заранее? (y/n) ");
            Scanner yesNo = new Scanner(System.in);
            String knowWord = yesNo.nextLine();
            if (knowWord.equals("y")) {
                AbstractGame.showWord();
            }
            System.out.println("Максимальное количество попыток " + AbstractGame.getMaxTry());
            ArrayList<String> logList = new ArrayList<>();
            while (gameEng.getGameStatus() != GameStatus.WIN && gameEng.getGameStatus() != GameStatus.LOSE) {
                System.out.println("Введите слово из " + AbstractGame.getSizeWord() + "-х букв: ");
                Scanner scanner = new Scanner(System.in);
                String inputValue = scanner.nextLine();
                Answer answer = gameEng.inputValue(inputValue);
                logList.add(inputValue);
                System.out.println(answer);
            }
            System.out.println(gameEng.getGameStatus().getDescription());
            System.out.println("Хотите посмотреть историю игры? y/n");
            Scanner yN = new Scanner(System.in);
            String history = yN.nextLine();
            if (history.equals("y")) {
                System.out.println("История ответов пользователя: " + logList);
            }
        }
    }
}