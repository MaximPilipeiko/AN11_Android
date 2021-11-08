import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        final File parentFile = new File("/Users/maksimpilipeiko/TMS/AN11_Android");
//        System.out.println("Exists: " + parentFile.exists());
//        System.out.println("Is file: " + parentFile.isFile());
//        System.out.println("Is directory: " + parentFile.isDirectory());
//        if (parentFile.isDirectory()) {
//            final FilenameFilter filter = new FilenameFilter() {
//                @Override
//                public boolean accept(final File dir, final String name) {
//                    return name.startsWith("lesson");
//                }
//            };
//            for (final String chFileName : parentFile.list(filter)) {
//                System.out.println(chFileName);
//            }
//        }


//
//        fileOutput.close();
//

//        final Application app = new Application(
//                new TelegramNotifierDecorator(
//                        new SmsNotifierDecorator(
//                                new Notifier()
//                        )
//                )
//        );
//        app.doSmth();
//        final File file = new File("/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/output/test.txt");
//        final FileOutputStream fileOutput = new FileOutputStream(file);
//        String str1 = "Привет мир";
//        fileOutput.write(str1.getBytes());
//
//        final FileInputStream fileInput = new FileInputStream(file);
//        final BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
//        final DataInputStream dataInput = new DataInputStream(
//                bufferedInput
//        );
//
//        final String s = dataInput.readUTF();
////        byte[] bytes = new byte[1000];
////        bufferedInput.read(bytes);
//        dataInput.close();
//
////        final String stringFromBytes = new String(bytes);
//        System.out.println(s);


//        DataOutputStream output = new DataOutputStream(
//                new FileOutputStream("/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/output/test1.out")
//        );
//        String str1 = "Привет мир";
//        output.writeDouble(12.12);
//        output.writeUTF(str1);
//        output.close();
//
//        var input = new DataInputStream(
//                new FileInputStream(
//                        "/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/output/test1.out"
//                )
//        );
//
//        final double result = input.readDouble();
//        final String str2 = input.readUTF();
//        input.close();
//        System.out.println(result);
//        System.out.println(str2);
//

        var output = new PrintStream(
                "/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/output/test2.txt"
        );
        output.println(12.12);
        output.print("Привет");
        output.flush();

//        final String filePath = "/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/output/test4.txt";
//        final String filePath1 = "/Users/maksimpilipeiko/TMS/AN11_Android/lesson9/lesson/input/test4.txt";
//        try (var fileWriter = new FileWriter(filePath);
//             var fileReader = new FileWriter(filePath)
//        ) {
//            fileWriter.write("Приветик");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
}
