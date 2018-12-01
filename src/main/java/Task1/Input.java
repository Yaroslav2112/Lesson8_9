package Task1;

import java.io.*;
import java.util.stream.Collectors;


public class Input {
    public static void main(String[] args) throws IOException {
        BufferedWriter output = null;
        try {
            String text = "Привіт, ";
            File file = new File("/home/yaroslav/IdeaProjects/Lesson8_9/src/main/resources/OutputTask_1.txt");
            Writer writer = new FileWriter(file);
            output = new BufferedWriter(writer);
            output.write(text);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Доброго дня, мене звати Мудра Idea, а як Вас звати?");
            String name = reader.readLine();
            name = name + ", приємно познайомитись!!!";
            System.out.println(text);
            System.out.println(name);
            output.write(name);
        } catch (Exception e) {
            System.out.println("сталася помилка");
        } finally {
            if (output != null) {
                output.close();
            }
        }
//        out.write(", дуже приємно познайомитись!!!");
    }
}

