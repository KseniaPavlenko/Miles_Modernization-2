public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 12_550;
        int bonusMilesCount = service.calculate(ticketPrice);
        System.out.println(bonusMilesCount);
    }
}
