import ru.netology.sqr.SQRService;

public class main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int amount = service.squareRoot(200, 300);
        System.out.println("Количество чисел" +  amount);
    }

}
