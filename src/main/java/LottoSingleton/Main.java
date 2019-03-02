package LottoSingleton;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {
        LottoSingleton lottoMachine = new LottoSingleton();
        System.out.println(lottoMachine.getRandomLottoNumbers());
    }

}
