import enums.RoomNumbers;
import enums.Types;
import model.House;
import service.HouseService;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(Types.HOUSE, BigDecimal.valueOf(2000000), BigDecimal.valueOf(120), RoomNumbers.THREE_PLUS_ONE);
        House house2 = new House(Types.HOUSE, BigDecimal.valueOf(1800000), BigDecimal.valueOf(90), RoomNumbers.TWO_PLUS_ONE);
        House house3 = new House(Types.HOUSE, BigDecimal.valueOf(1500000), BigDecimal.valueOf(70), RoomNumbers.ONE_PLUS_ONE);
        House villa1 = new House(Types.VILLA, BigDecimal.valueOf(3500000), BigDecimal.valueOf(100), RoomNumbers.TWO_PLUS_ONE);
        House villa2 = new House(Types.VILLA, BigDecimal.valueOf(3300000), BigDecimal.valueOf(180), RoomNumbers.THREE_PLUS_ONE);
        House villa3 = new House(Types.VILLA, BigDecimal.valueOf(3400000), BigDecimal.valueOf(190), RoomNumbers.FOUR_PLUS_ONE);
        House summerhouse1 = new House(Types.SUMMER_HOUSE, BigDecimal.valueOf(4000000), BigDecimal.valueOf(220), RoomNumbers.FOUR_PLUS_ONE);
        House summerhouse2 = new House(Types.SUMMER_HOUSE, BigDecimal.valueOf(4500000), BigDecimal.valueOf(230), RoomNumbers.FOUR_PLUS_TWO);
        House summerhouse3 = new House(Types.SUMMER_HOUSE, BigDecimal.valueOf(4300000), BigDecimal.valueOf(210), RoomNumbers.FOUR_PLUS_TWO);

        HouseService houseService = new HouseService();

        houseService.addHouses(house1);
        houseService.addHouses(house2);
        houseService.addHouses(house3);
        houseService.addHouses(villa1);
        houseService.addHouses(villa2);
        houseService.addHouses(villa3);
        houseService.addHouses(summerhouse1);
        houseService.addHouses(summerhouse2);
        houseService.addHouses(summerhouse3);

        List<House> allHouses = houseService.getAllHouses();

        BigDecimal totalPriceOfHouseTypes = houseService.getTotalPriceByType(allHouses,Types.HOUSE);
        System.out.println("Question 1 Total price of the house types: " + totalPriceOfHouseTypes + " TL");

        BigDecimal totalPriceOfVillaTypes = houseService.getTotalPriceByType(allHouses,Types.VILLA);
        System.out.println("Question 2 Total price of the villa types: " + totalPriceOfVillaTypes + " TL");

        BigDecimal totalPriceOfSummerHouses = houseService.getTotalPriceByType(allHouses, Types.SUMMER_HOUSE);
        System.out.println("Question 3 Total price of the summer houses: " + totalPriceOfSummerHouses + " TL");

        BigDecimal totalPriceOfAllHouses = houseService.getTotalPriceOfAllHouses(allHouses);
        System.out.println("Question 4 Total price of all type houses: " + totalPriceOfAllHouses + " TL");

        double avgAreaOfHouses = houseService.getAverageAreaByType(allHouses, Types.HOUSE);
        System.out.println("Question 5 Average area of house types: " + avgAreaOfHouses + " m^2");

        double avgAreaOfVillas = houseService.getAverageAreaByType(allHouses, Types.VILLA);
        System.out.println("Question 6 Average area of villa types: " + avgAreaOfVillas + " m^2");

        double avgAreaOfSummerHouses = houseService.getAverageAreaByType(allHouses, Types.SUMMER_HOUSE);
        System.out.println("Question 7 Average area of summer house types: " + avgAreaOfSummerHouses + " m^2");

        double avgAreaOfAllTypes = houseService.getAverageAreaOfAllTypes(allHouses);
        System.out.println("Question 8 Average area of all types: " + avgAreaOfAllTypes + " m^2");

        List<House> housesByRoomNumbers = houseService.getHouseTypeByRoomNumber((RoomNumbers.FOUR_PLUS_ONE), allHouses);
        System.out.println("Question 9 All types of houses according to the number of rooms and living rooms" + housesByRoomNumbers);



    }
}