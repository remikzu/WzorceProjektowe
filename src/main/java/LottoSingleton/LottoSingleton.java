package LottoSingleton;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Remigiusz Zudzin
 */
public class LottoSingleton {

    Random random = new Random();
    Map<LocalDate, Set<Integer>> resultMap = new HashMap<>();

    private static LottoSingleton instance;

    public LottoSingleton() {
    }

    public static LottoSingleton getInstance() {
        if (instance == null) {
            instance = new LottoSingleton();
        }
        return instance;
    }

    Set<Integer> getRandomLottoNumbers() {
        Set<Integer> numbers = new TreeSet<>();
        while(numbers.size() < 6) {
            numbers.add(random.nextInt(49)+1);
        }
        return numbers;
    }

    public Set<Integer> getResult(LocalDate date) {
        if (!resultMap.containsKey(date)) {
            resultMap.put(date, getRandomLottoNumbers());
        }
        return (resultMap.get(date));
    }

}
