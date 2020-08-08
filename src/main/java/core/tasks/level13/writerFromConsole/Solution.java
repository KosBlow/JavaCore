package core.tasks.level13.writerFromConsole;

import java.io.*;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 */

public class Solution {
    public static void main(String[] args)   {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File(reader.readLine());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String s;

            while (!(s = reader.readLine()).equals("exit")) {
                writer.write(s+"\r\n");
            }
            writer.write(s);



            reader.close();
            writer.close();

        } catch (Exception e) {
            System.out.println("something is wrong ");
        }

    }
}
