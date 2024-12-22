import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // 数値のリストを作成
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 偶数をフィルタリングして新しいリストを作成
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());

        // 結果を出力
        System.out.println("偶数のリスト: " + evenNumbers);
    }
}
