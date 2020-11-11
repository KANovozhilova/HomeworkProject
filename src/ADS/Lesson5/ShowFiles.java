package ADS.Lesson5;

import java.io.File;

public class ShowFiles {

    public static void main(String[] args) {
        File root = new File("c:\\Users\\nowoz\\IdeaProjects\\Java3\\src\\Lesson1\\");
        viewDir("", root);
    }

    private static void viewDir(String prefix, File root) {
        if (root.isFile()) {
            System.out.println(prefix + "Файл: " + root.getName());
        }
        else {
            System.out.println(prefix + "Папка: " + root.getName());
            for (File file : root.listFiles()) {
                viewDir(prefix + "  ", file);
            }
        }
    }
}
