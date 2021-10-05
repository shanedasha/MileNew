public class BonusMilesService {
    public int calculate(int price) {
        int amountForMile = 20;
        int miles = (price / amountForMile);
        return miles;
    }
}
