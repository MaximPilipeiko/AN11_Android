import java.io.*;

public class Run {
    public static String bufferedRead(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );

        StringBuilder result = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            result.append(line);
            result.append("\n");
            line = reader.readLine();
        }
        reader.close();

        return result.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final File file = new File("/Users/maksimpilipeiko/TMS/AN11_Android");

        final File newFile = new File(file.getAbsolutePath() + "/lesson9/lesson/new_file.txt");
//        newFile.createNewFile();

//        System.out.println("Exists: " + file.exists());
//        for (final String fileName : file.list((dir, name) -> name.startsWith("lesson"))) {
//            System.out.println(fileName);
//        }
//
//        final PrintStream fileOutput = new PrintStream(
//                    new FileOutputStream(newFile)
//        );
//
//        fileOutput.print(12.12);

//        fileOutput.close();

//        final var fileInput = new StringBufferInputStream(
//                new FileInputStream(newFile)
//        );
//        final int i1 = fileInput.;
//        fileInput.close();
//        System.out.println((char) i1);
//        final FileWriter out = new FileWriter(newFile);
//        out.write("Hey!!");
////        final BufferedWriter bufferedWriter = new BufferedWriter(out);
//        out.close();


//        final String s = bufferedRead("/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/input/input.txt");
//        System.out.println(s);

//        var output = new DataOutputStream(
//          new FileOutputStream(newFile)
//        );
//        output.writeDouble(12.12);
//        output.close();
//
//        var input = new DataInputStream(
//                new FileInputStream(newFile)
//        );
//        double result = input.readDouble();
//        System.out.print("Result: ");
//        System.out.println(result);

//        final PrintStream printStream = new PrintStream(
//                new BufferedOutputStream(
//                        new FileOutputStream(newFile)
//                )
//        );
//        printStream.println("привет\nя тут\nёёё");
//        printStream.close();

//        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        while ((s = in.readLine()) != null) {
//            System.out.println(s);
//        }

//        final PrintWriter printWriter = new PrintWriter(System.out, true);
//        printWriter.println(12);

        final ObjectOutputStream objectOutput = new ObjectOutputStream(
                new FileOutputStream(newFile)
        );
        final Person kira = new Person(1L, "Kira", "11111111");
        final Person vika = new Person(2L, "Vika", "0000000");
        objectOutput.writeObject(kira);
        objectOutput.writeObject(vika);
        objectOutput.close();
        final ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(newFile));
        Person kira1 = (Person) objectInput.readObject();
        Person vika1 = (Person) objectInput.readObject();

        System.out.println(kira1);
        System.out.println(vika1);

//        try (FileInputStream fin = new FileInputStream("lesson/input/input.txt")) {
//            int i = -1;
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//        final FileReader fileReader = new FileReader(newFile);
//        final char[] chars = new char[6];
//        fileReader.read(chars, 0, 5);
//        System.out.println(chars);
//        fileReader.close();
    }
}
