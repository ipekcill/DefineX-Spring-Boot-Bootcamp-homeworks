package service;

import enums.RoomNumbers;
import enums.Types;
import model.House;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot*/
public class HouseService {
    private List<House> allHouses = new ArrayList<>();

    public HouseService() {
    }

    public void addHouses(House house) {
        allHouses.add(house);
    }

    public List<House> getAllHouses() {
        return allHouses;
    }

    public BigDecimal getTotalPriceOfAllHouses(List<House> allHouses) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (House house : allHouses) {
            totalPrice = totalPrice.add(house.getPrice());
        }
        return totalPrice;
    }

    public BigDecimal getTotalPriceByType(List<House> allHouses, Types type) {
        return allHouses.stream()
                .filter(house -> house.getType() == type)
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public double getAverageAreaByType(List<House> allHouses, Types type) {
        BigDecimal totalArea = BigDecimal.ZERO;
        int count = 0;
        double avgArea;
        for (House house : allHouses) {
            if (house.getType() == type) {
                count++;
                totalArea = totalArea.add(house.getArea());
            }
        }
        avgArea = totalArea.doubleValue() / count;
        return avgArea;
    }

    public double getAverageAreaOfAllTypes(List<House> allHouses) {
        BigDecimal totalArea = BigDecimal.ZERO;
        double avgArea;
        for (House house : allHouses) {
            totalArea = totalArea.add(house.getArea());
        }
        avgArea = totalArea.doubleValue() / allHouses.size();
        return avgArea;
    }

    public  List<House> getHouseTypeByRoomNumber (RoomNumbers roomNumbers, List<House> allHouses) {
        List<House> housesByRoomNumbersList = new ArrayList<>();
        for(House house : allHouses) {
            if(roomNumbers == house.getRooms()) {
                housesByRoomNumbersList.add(house);
            }
        }
        return housesByRoomNumbersList;
    }

}
