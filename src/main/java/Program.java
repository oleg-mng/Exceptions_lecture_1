import java.io.File;

public class Program {

        public static void main(String[] args) {
//            a();
//            c();
            System.out.println(divide(10,0));
//            System.out.println(getFileSize(new File("123")));
//            System.out.println(getFileSize(new File("/Users/olegmonogarov/GeekBrains_/01.07 Колесо компетенций.pdf")));
        }

        public static long getFileSize(File file){
            if (!file.exists()){
                return -1L;
            }
            return file.length();
        }
        public static int divide(int a1, int a2) {
            if (a2 == 0) {
                throw new RuntimeException("Divide by zero not permited");
            }
            return a1 / a2;
        }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int [] anw = new int[10];
        System.out.println(anw[1000]);
    }
//        System.out.println(getFileSize(new File("/Users/olegmonogarov/GeekBrains_/01.07 Колесо компетенций.pdf")));
//        System.out.println(divide(10,0));
//    }
//    public static int divide(int a1, int a2){
//        if (a2 == 0) {
//            return -1;
//        }
//        return a1/a2;
//    }

}


