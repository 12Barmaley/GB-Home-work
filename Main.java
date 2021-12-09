package java2.hw5;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list;
        list = fileRead();

        int width = list.get(1).split(";").length;
        int high = list.size() - 1;
        int[][] dataArray = new int[high][width];

        for (int i = 0; i < high; i++) {
            String[] strings = list.get(i + 1).split(";");
            for (int j = 0; j < width; j++) {
                dataArray[i][j] = Integer.parseInt(strings[j]);
            }
        }

        AppData appData = new AppData();
        appData.setHeader(list.get(0).split(";"));
        appData.setData(dataArray);

        fileWrite(appData);
    }

    public static List<String> fileRead() {
        File file = new File("src/java2/hw5/file-in-example.csv");
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void fileWrite(AppData appData) throws IOException {

        File fileOut = new File("src/java2/hw5/file-out-example.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut));

        for (int i = 0; i < appData.getHeader().length; i++) {
            String string = appData.getHeader()[i];
            bufferedWriter.write(string);
            if (i < appData.getHeader().length - 1) {
                bufferedWriter.write(";");
            }
        }

        bufferedWriter.write("\n");

        for (int i = 0; i < appData.getData().length; i++) {
            for (int j = 0; j < appData.getData()[i].length; j++) {
                Integer value = appData.getData()[i][j];
                bufferedWriter.write(String.valueOf(value));
                if (j < appData.getData()[i].length - 1) {
                    bufferedWriter.write(";");
                }
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
