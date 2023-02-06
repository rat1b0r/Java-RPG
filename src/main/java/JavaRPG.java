import java.io.IOException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

class hp_damage_animation {
// анимация отнимания жизек----------------------------------------------
    public String player1_hp_damage_animation (int player1_hp, int player1_hp_max) {

        // переменные цвета букв
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        // переменные цвета фона
        String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        // Переменные жизек

        String player1_hp_interface, player1_hp_interface_01, player1_hp_interface_02, player1_hp_interface_03, player1_hp_interface_04, player1_hp_interface_05, player1_hp_interface_06, player1_hp_interface_07, player1_hp_interface_08, player1_hp_interface_09, player1_hp_interface_10, player1_hp_interface_11, player1_hp_interface_12, player1_hp_interface_13, player1_hp_interface_14, player1_hp_interface_15, player1_hp_interface_16, player1_hp_interface_17, player1_hp_interface_18, player1_hp_interface_19, player1_hp_interface_20;
        String player1_hp_interface_color_01, player1_hp_interface_color_02, player1_hp_interface_color_03, player1_hp_interface_color_04, player1_hp_interface_color_05, player1_hp_interface_color_06, player1_hp_interface_color_07, player1_hp_interface_color_08, player1_hp_interface_color_09, player1_hp_interface_color_10, player1_hp_interface_color_11, player1_hp_interface_color_12, player1_hp_interface_color_13, player1_hp_interface_color_14, player1_hp_interface_color_15, player1_hp_interface_color_16, player1_hp_interface_color_17, player1_hp_interface_color_18, player1_hp_interface_color_19, player1_hp_interface_color_20;
        int player1_hp_hundreds, player1_hp_tens, player1_hp_units, player1_hp_max_hundreds, player1_hp_max_tens, player1_hp_max_units;

        // вычисляем сотни, десятки и единицы жизек
        player1_hp_hundreds = player1_hp / 100;
        player1_hp_tens = (player1_hp - (player1_hp_hundreds * 100)) / 10;
        player1_hp_units = player1_hp - (player1_hp_hundreds * 100) - (player1_hp_tens * 10);
        player1_hp_max_hundreds = player1_hp_max / 100;
        player1_hp_max_tens = (player1_hp_max - (player1_hp_max_hundreds * 100)) / 10;
        player1_hp_max_units = player1_hp_max - (player1_hp_max_hundreds * 100) - (player1_hp_max_tens * 10);

        // считаем каким цветом какая клеточка жизек
        if (player1_hp > 0) {
            player1_hp_interface_color_01 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_01 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 5) {
            player1_hp_interface_color_02 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_02 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 10) {
            player1_hp_interface_color_03 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_03 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 15) {
            player1_hp_interface_color_04 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_04 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 20) {
            player1_hp_interface_color_05 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_05 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 25) {
            player1_hp_interface_color_06 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_06 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 30) {
            player1_hp_interface_color_07 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_07 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 35) {
            player1_hp_interface_color_08 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_08 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 40) {
            player1_hp_interface_color_09 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_09 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 45) {
            player1_hp_interface_color_10 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_10 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 50) {
            player1_hp_interface_color_11 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_11 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 55) {
            player1_hp_interface_color_12 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_12 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 60) {
            player1_hp_interface_color_13 = ANSI_RED_BACKGROUND;
        } else {
            player1_hp_interface_color_13 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 65) {
            player1_hp_interface_color_14 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_14 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 70) {
            player1_hp_interface_color_15 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_15 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 75) {
            player1_hp_interface_color_16 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_16 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 80) {
            player1_hp_interface_color_17 = ANSI_RED_BACKGROUND;
        } else
        {
            player1_hp_interface_color_17 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 85) {
            player1_hp_interface_color_18 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_18 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 90) {
            player1_hp_interface_color_19 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_19 = ANSI_BLACK_BACKGROUND;
        }
        if (player1_hp > (player1_hp_max / 100) * 95) {
            player1_hp_interface_color_20 = ANSI_RED_BACKGROUND;
        }
        else {
            player1_hp_interface_color_20 = ANSI_BLACK_BACKGROUND;
        }

        // делим по клеточкам весь цвет жизек
        player1_hp_interface_01 = player1_hp_interface_color_01 + " ";
        player1_hp_interface_02 = player1_hp_interface_color_02 + " ";
        player1_hp_interface_03 = player1_hp_interface_color_03 + " ";
        player1_hp_interface_04 = player1_hp_interface_color_04 + " ";
        player1_hp_interface_05 = player1_hp_interface_color_05 + " ";
        player1_hp_interface_06 = player1_hp_interface_color_06 + " ";
        player1_hp_interface_07 = player1_hp_interface_color_07 + player1_hp_hundreds;
        player1_hp_interface_08 = player1_hp_interface_color_08 + player1_hp_tens;
        player1_hp_interface_09 = player1_hp_interface_color_09 + player1_hp_units;
        player1_hp_interface_10 = player1_hp_interface_color_10 + "/";
        player1_hp_interface_11 = player1_hp_interface_color_11 + player1_hp_max_hundreds;
        player1_hp_interface_12 = player1_hp_interface_color_12 + player1_hp_max_tens;
        player1_hp_interface_13 = player1_hp_interface_color_13 + player1_hp_max_units;
        player1_hp_interface_14 = player1_hp_interface_color_14 + " ";
        player1_hp_interface_15 = player1_hp_interface_color_15 + " ";
        player1_hp_interface_16 = player1_hp_interface_color_16 + " ";
        player1_hp_interface_17 = player1_hp_interface_color_17 + " ";
        player1_hp_interface_18 = player1_hp_interface_color_18 + " ";
        player1_hp_interface_19 = player1_hp_interface_color_19 + " ";
        player1_hp_interface_20 = player1_hp_interface_color_20 + " " + ANSI_BLACK_BACKGROUND;
        player1_hp_interface = player1_hp_interface_01 + player1_hp_interface_02 + player1_hp_interface_03 + player1_hp_interface_04 + player1_hp_interface_05 + player1_hp_interface_06 + player1_hp_interface_07 + player1_hp_interface_08 + player1_hp_interface_09 + player1_hp_interface_10 + player1_hp_interface_11 + player1_hp_interface_12 + player1_hp_interface_13 + player1_hp_interface_14 + player1_hp_interface_15 + player1_hp_interface_16 + player1_hp_interface_17 + player1_hp_interface_18 + player1_hp_interface_19 + player1_hp_interface_20;
        return player1_hp_interface;
    }
}

public class JavaRPG {
    // ----------------------MAIN-----------------------------
    public static void main (String[] args) throws InterruptedException, IOException {

        // активируем ввод с клавиатуры
        Scanner sc = new Scanner(System.in);

        // прикрепляем текущие потоки ввода вывода к процессу
        new ProcessBuilder("cmd", "/c", "cls")
                .inheritIO()
                .start()
                .waitFor();

        // ---------------------------------ПЕРЕМЕННЫЕ--------------------------------------

        // Переменные раскидать
        int i, j, fps;
        String player1_armor_interface;
        String player1_damage_interface;
        int player1_hp, player1_hp_max;
        int player1_armor, player1_armor_max;
        int player1_damage, player1_damage_max;

        // дефолты
        player1_hp = 100;
        player1_hp_max = 100;
        player1_armor = 10;
        player1_armor_max = 10;
        player1_damage = 12;
        player1_damage_max = 15;
        fps = 1;
        player1_armor_interface = "       " + player1_armor + "/" + player1_armor_max + "        ";
        player1_damage_interface = "       " + player1_damage + "-" + player1_damage_max + "        ";

        // очищаем экран
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("cls");
        }
        catch (Exception e) {}

        // создаем объект класса для отрисовки hp
        hp_damage_animation hp_damage_animation = new hp_damage_animation();

        // отрисовка экрана статуса
        for ( i = 0; i < 6000; ++i) {
            System.out.println("                                                                                                                                                                                                        ");
            System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("|                                                                                                                                                                                                      |");
            // строка со шкалой здоровья
            System.out.println("|      HP [" + hp_damage_animation.player1_hp_damage_animation(player1_hp, player1_hp_max) + "]                                                                                                                                                                       |");

            System.out.println("|                                                                                                                                                                                                      |");
            System.out.println("|                                                                                                                                                                                                      |");
            System.out.println("|                                                                                                                                                                                                      |");
            System.out.println("|                                                                                                                                                                                                      |");

//            // строка со шкалой брони
//            System.out.println("|   ARMOR [" + ANSI_BLUE_BACKGROUND + player1_armor_interface + ANSI_BLACK_BACKGROUND + "]                                                                                                                                                                       |");

//            System.out.println("|                                                                                                                                                                                                      |");

            // строка со шкалой урона
//            System.out.println("|  DAMAGE [" + ANSI_PURPLE_BACKGROUND + player1_damage_interface + ANSI_BLACK_BACKGROUND + "]                                                                                                                                                                       |");

            for ( j = 0; j < 42; ++j) {
                System.out.println("|                                                                                                                                                                                                      |");
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(fps);
            sleep (66);
            fps++;
            player1_hp = player1_hp - 1;





            runtime = Runtime.getRuntime();
            try {
                Process process = runtime.exec("cls");
            }
            catch (Exception e) {}
        }
    }
}