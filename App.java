import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        int number;
        boolean bool;
        String str;
        char cha;

        number = 2;
        number++;
        bool = true;
        str = "Hi";

        System.out.println(number);
        if (bool) {
            System.out.println(bool);
        }
        System.out.println(str);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.insert(0, "second");
        String result = sb.toString();
        System.out.println(result.substring(0, 4));

        String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };
        System.out.println(weeks[3]);

        ArrayList fruit = new ArrayList();
        fruit.add("귤");
        fruit.add("한라봉");
        fruit.add("샤인머스켓");
        fruit.add("생귤탱귤");
        System.out.println(fruit.size());
        System.out.println(fruit.contains("귤"));

        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));

        String numTest = "123";
        int n = Integer.parseInt(numTest);
        System.out.println(n);

        MainFrame myFrame = new MainFrame();
        myFrame.init();
    }

}