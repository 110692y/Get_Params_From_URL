import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Classic {
    public static void main(String[] args) throws IOException {

        String urlStr = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        String usingString = urlStr.substring(urlStr.indexOf("?") + 1);
        ArrayList<String> scope = new ArrayList<>();
        ArrayList<String> paramsList = new ArrayList<>();

        int count = 1;
        for (char element : usingString.toCharArray()) {
            if (element == '&') {
                count++;
            }
        }

        for (int i = 0; i < count; i++)
            scope.add(i, usingString.split("&")[i]);
        System.out.println("Параметры и значения: " + scope);
        System.out.println("Их кол-во: " + scope.size());

        for (String item : scope) {
            paramsList.add(item.substring(0, item.indexOf("=")));
        }

        for (String item : paramsList)
            System.out.print(item + " ");
    }
}
// Console text for test: test.ru/getparams?sun=hide&sea=blue&grass=green