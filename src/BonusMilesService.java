public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int oneMileCost = 20;
        int bonusMilesCount = ticketPrice / oneMileCost;
        return bonusMilesCount;
    }
}
