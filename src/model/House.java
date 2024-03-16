package model;

import enums.RoomNumbers;
import enums.Types;

import java.math.BigDecimal;

public class House {
    private Types type;
    private BigDecimal price;
    private BigDecimal area;
    private RoomNumbers rooms;

    public House(Types type, BigDecimal price, BigDecimal area, RoomNumbers rooms) {
        this.type = type;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public RoomNumbers getRooms() {
        return rooms;
    }

    public void setRooms(RoomNumbers rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + type +
                ", price=" + price +
                ", area=" + area +
                ", rooms=" + rooms +
                '}';
    }
}
